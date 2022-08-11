package com.gv4.core.services;

import com.gv4.core.models.business.SubjectDTO;
import com.gv4.core.models.entities.SubjectEntity;
import com.gv4.core.repositories.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    private final static Logger LOGGER = LoggerFactory.getLogger(SubjectService.class);

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<SubjectDTO> getSubjects(){
        return subjectRepository.findAll().stream().map(this::getSubjectDTO).collect(Collectors.toList());
    }

    public SubjectDTO getSubject(Long id){
        return getSubjectDTO(subjectRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No subject for id = " + id)));
    }

    private SubjectDTO getSubjectDTO(SubjectEntity subjectEntity){
        return SubjectDTO.builder()
                .id(subjectEntity.getId())
                .name(subjectEntity.getName())
                .alias(subjectEntity.getAlias())
                .build();
    }
}
