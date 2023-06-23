package com.example.ApiTest.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage {
    private int code;
    private String status;
    private String messagell;
    private String description;

    public ErrorMessage(int code, String status, String messagell, String description) {
        this.code = code;
        this.status = status;
        this.messagell = messagell;
        this.description = description;
    }

    public ErrorMessage() {
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", messagell='" + messagell + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
