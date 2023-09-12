package com.practice.moduleapi.exception;

import com.practice.moduleCommon.enums.Purchase;
import com.practice.moduleapi.response.ResponseFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(CustomException.class)
    public ResponseFormat handlerCustomException(CustomException e){
        return ResponseFormat.builder()
                .returnCode(e.getReturnStateCode())
                .returnMessage(e.getReturnMessage())
                .build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseFormat handlerException(Exception e){
        return ResponseFormat.builder()
                .returnCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .returnMessage(e.getMessage())
                .build();
    }
}
