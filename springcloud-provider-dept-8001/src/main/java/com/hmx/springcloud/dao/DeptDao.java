package com.hmx.springcloud.dao;

import com.hmx.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName DeptDao
 * @Description TODO
 * @Author xin
 * @Date 2020/4/6 18:28
 * @Version 1.0
 **/
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryDeptById(Long id);

    List<Dept> queryAll();
}
