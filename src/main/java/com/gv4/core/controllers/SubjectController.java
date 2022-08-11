package com.gv4.core.controllers;

import com.gv4.core.models.business.SubjectDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${gv4.specificPath.subjectController}")
@Validated
public class SubjectController {

    public ResponseEntity<SubjectDTO> getSubjects(){
        return null;
    }

}
