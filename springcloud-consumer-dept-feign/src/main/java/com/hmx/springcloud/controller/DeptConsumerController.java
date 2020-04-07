package com.hmx.springcloud.controller;

import com.hmx.springcloud.pojo.Dept;
import com.hmx.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName DeptConsumerController
 * @Description TODO
 * @Author xin
 * @Date 2020/4/6 19:27
 * @Version 1.0
 **/
@RestController
public class DeptConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    //ribbon方式
    //private static final String REST_URL_PREFIX="http://localhost:8001";
    //private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";

    //feign方式
    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return service.queryDeptById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return service.queryAll();
    }
}
