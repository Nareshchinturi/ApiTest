package com.example.ApiTest.model;

import org.springframework.stereotype.Component;

@Component
public class ApiTestResponse {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApiTestResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ApiTestResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ApiTestResponse() {
    }
}
