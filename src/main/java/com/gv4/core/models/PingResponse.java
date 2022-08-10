package com.gv4.core.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class PingResponse {

    @Nullable
    private String message;

    @NonNull
    private LocalDateTime timestamp;

    @NonNull
    private UUID uuid;
}
