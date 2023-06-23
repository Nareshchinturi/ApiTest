package com.example.ApiTest.controller;

import com.example.ApiTest.model.ApiTestRequest;
import com.example.ApiTest.model.ApiTestResponse;
import com.example.ApiTest.service.ApiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ApiTestController {

    @Autowired
    private ApiTestService service;

    @PostMapping("testService")
    public ApiTestResponse createTestService(@RequestBody ApiTestRequest apiTestRequest){

        return service.createService(apiTestRequest);
    }
        @GetMapping("getTestService/{id}")
    public ApiTestResponse getTestService(@PathVariable String id){

        return service.getService(id);
    }
}
