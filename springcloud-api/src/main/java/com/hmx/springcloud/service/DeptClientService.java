package com.hmx.springcloud.service;

import com.hmx.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @ClassName DeptClientService
 * @Description TODO
 * @Author xin
 * @Date 2020/4/7 15:32
 * @Version 1.0
 **/
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept queryDeptById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();
}
