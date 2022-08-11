package com.gv4.core.models.others;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CommonErrorResponse {

    @NonNull
    private String message;

    @NonNull
    private Integer statusCode;

    @NonNull
    private String status;

    @NonNull
    private LocalDateTime timestamp;

    @NonNull
    private UUID uuid;

    public static CommonErrorResponse getBody(String message, HttpStatus httpStatus){
        return CommonErrorResponse.builder()
                .message(message)
                .statusCode(httpStatus.value())
                .status(httpStatus.name())
                .timestamp(LocalDateTime.now())
                .uuid(UUID.randomUUID())
                .build();
    }

}
