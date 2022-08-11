package com.gv4.core.services;

import com.gv4.core.models.business.SubjectDTO;
import com.gv4.core.models.entities.SubjectEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Stream;

@Service
public class SubjectService {

    private final static Logger LOGGER = LoggerFactory.getLogger(SubjectService.class);


    private SubjectDTO toSubjectDTO (SubjectEntity subjectEntity){

        return SubjectDTO.builder()
                .id(subjectEntity.getId())
                .name(subjectEntity.getName())
                .alias(subjectEntity.getAlias())
                .build();
    }




}
