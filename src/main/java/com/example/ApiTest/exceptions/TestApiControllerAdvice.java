package com.example.ApiTest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TestApiControllerAdvice {

    @ExceptionHandler(ServiceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
   private ErrorMessage handleServiceNotFoundException(ServiceNotFoundException ex){

        ErrorMessage message = new ErrorMessage(400,
                "status",
                ex.getMessage(),
                "description");

        return message;

    }
}
