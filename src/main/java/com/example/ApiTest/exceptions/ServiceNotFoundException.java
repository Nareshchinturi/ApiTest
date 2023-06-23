package com.example.ApiTest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;



public class ServiceNotFoundException extends RuntimeException implements Serializable {
    public ServiceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
