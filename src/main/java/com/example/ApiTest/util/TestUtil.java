package com.example.ApiTest.util;

import com.example.ApiTest.model.ApiTestRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestUtil {
    private static List<ApiTestRequest> list=new ArrayList<>();

    private static Map<Integer,ApiTestRequest> map=new HashMap<>();


    public void addService(ApiTestRequest request){
        list.add(request);
        map.put(request.getId(),request);
    }

    public ApiTestRequest getService(String id){
       return map.get(Integer.parseInt(id));
    }

}
