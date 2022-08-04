package com.gv4.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("${gv4.specificPath.pingCoreController}")
public class PingCoreController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PingCoreController.class);

    @GetMapping
    private ResponseEntity<String> ping (){
        return ResponseEntity.ok("hej");
    }


}
