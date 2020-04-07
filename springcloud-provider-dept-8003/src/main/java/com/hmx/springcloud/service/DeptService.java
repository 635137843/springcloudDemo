package com.hmx.springcloud.service;

import com.hmx.springcloud.pojo.Dept;

import java.util.List;

/**
 * @ClassName DeptService
 * @Description TODO
 * @Author xin
 * @Date 2020/4/6 18:37
 * @Version 1.0
 **/
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryDeptById(Long id);

    List<Dept> queryAll();
}
