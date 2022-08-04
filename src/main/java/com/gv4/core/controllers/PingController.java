package com.gv4.core.controllers;

import com.gv4.core.models.PingResponse;
import com.gv4.core.services.PingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("${gv4.specificPath.pingController}")
@CrossOrigin
public class PingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PingController.class);

    private final PingService pingService;

    public PingController(PingService pingService) {
        this.pingService = pingService;
    }

    @GetMapping
    public ResponseEntity<PingResponse> getPingResponse (@RequestBody @Nullable String message){
        return ResponseEntity.ok(pingService.getPingResponse(message));
    }

}
