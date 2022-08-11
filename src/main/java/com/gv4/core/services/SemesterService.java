package com.gv4.core.services;

import com.gv4.core.repositories.SemesterRepository;
import org.springframework.stereotype.Service;

@Service
public class SemesterService {

    private final SemesterRepository semesterRepository;

    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    //TODO (...)

}
