package com.example.ApiTest.service;

import com.example.ApiTest.exceptions.ServiceNotFoundException;
import com.example.ApiTest.model.ApiTestRequest;
import com.example.ApiTest.model.ApiTestResponse;
import com.example.ApiTest.util.TestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ApiTestService {

    @Autowired
    private TestUtil testUtil;

    public ApiTestResponse createService(ApiTestRequest apiTestRequest) {
        testUtil.addService(apiTestRequest);
        return new ApiTestResponse();
    }

    public ApiTestResponse getService(String apiTestRequest) throws ServiceNotFoundException {
        ApiTestRequest request= testUtil.getService(apiTestRequest);
        if(request == null){
            throw new ServiceNotFoundException("meassge",new RuntimeException());
        }
        return new ApiTestResponse(request.getId(), request.getName());
    }
}
