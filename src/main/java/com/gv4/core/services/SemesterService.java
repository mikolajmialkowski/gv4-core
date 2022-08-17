package com.gv4.core.services;

import com.gv4.core.models.business.SemesterDTO;
import com.gv4.core.models.entities.SemesterEntity;
import com.gv4.core.repositories.SemesterRepository;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SemesterService {

    private final static Logger LOGGER = LoggerFactory.getLogger(SemesterService.class);

    private final SemesterRepository semesterRepository;

    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    public List<SemesterDTO> getSemesters(){
        return semesterRepository.findAll().stream().map(this::getSemesterDTO).collect(Collectors.toList());
    }

    @SneakyThrows
    public SemesterDTO getSemester(Long id){
        return getSemesterDTO(semesterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No semester for id = " + id)));
    }

    public SemesterDTO addSemester(SemesterDTO semesterDTO){
        semesterRepository.findBySemesterNumber(semesterDTO.getAlias())
                .ifPresent((duplicate) -> {
                    throw new IllegalFieldException("Values have to be unique for alias = " + subjectDTO.getAlias());
                });

        return getSubjectDTO(subjectRepository.saveAndFlush(getSubjectEntity(subjectDTO)));
    }

    private SemesterDTO getSemesterDTO(SemesterEntity semesterEntity){
        return SemesterDTO.builder()
                .id(semesterEntity.getId())
                .name(semesterEntity.getName())
                .alias(semesterEntity.getAlias())
                .build();
    }

    private SemesterEntity getSemesterEntity(SemesterDTO semesterDTO){
        return SemesterEntity.builder()
                .name(semesterDTO.getName())
                .alias(semesterDTO.getAlias())
                .build();
    }
}
