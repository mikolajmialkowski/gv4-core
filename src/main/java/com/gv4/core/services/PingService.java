package com.gv4.core.services;

import com.gv4.core.models.PingResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PingService {

    public PingResponse getPingResponse(@Nullable String message){
        return PingResponse.builder()
                .message(message)
                .timestamp(LocalDateTime.now())
                .uuid(UUID.randomUUID())
                .build();
    }
}
