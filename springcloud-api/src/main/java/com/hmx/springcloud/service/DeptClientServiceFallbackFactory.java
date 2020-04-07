package com.hmx.springcloud.service;

import com.hmx.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DeptClientServiceFallbackFactory
 * @Description TODO
 * @Author xin
 * @Date 2020/4/7 17:31
 * @Version 1.0
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryDeptById(Long id) {
                return new Dept().setDeptno(id).setDname("id=>"+id+"没有对应信息，客户端提供服务降级的信息。").setDb_source("服务降级，没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
