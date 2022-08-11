package com.gv4.core.utils;

import com.gv4.core.models.exceptions.IllegalFieldException;
import com.gv4.core.models.others.CommonErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CommonExceptionHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<CommonErrorResponse> handleNotFoundException(ResourceNotFoundException resourceNotFoundException, WebRequest webRequest){
        LOGGER.error("ResourceNotFoundException: " + resourceNotFoundException.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(CommonErrorResponse
                .getBody(resourceNotFoundException.getMessage(), HttpStatus.NOT_FOUND));
    }

    @ExceptionHandler({IllegalFieldException.class})
    public ResponseEntity<CommonErrorResponse> handleIllegalFieldException(IllegalFieldException illegalFieldException, WebRequest webRequest){
        LOGGER.error("IllegalFieldException: " + illegalFieldException.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(CommonErrorResponse
                .getBody(illegalFieldException.getMessage(), HttpStatus.BAD_REQUEST));
    }
}
