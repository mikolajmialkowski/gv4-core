package com.gv4.core.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class PingResponse {
    private String message;
    private LocalDateTime timestamp;
    private UUID uuid;
}
