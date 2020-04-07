package com.hmx.springcloud.service.impl;

import com.hmx.springcloud.dao.DeptDao;
import com.hmx.springcloud.pojo.Dept;
import com.hmx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author xin
 * @Date 2020/4/6 18:39
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryDeptById(Long id) {
        return deptDao.queryDeptById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
