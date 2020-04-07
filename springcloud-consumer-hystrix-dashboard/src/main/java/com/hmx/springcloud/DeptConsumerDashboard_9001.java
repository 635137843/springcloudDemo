package com.hmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName DeptConsumerDashboard_9001
 * @Description TODO
 * @Author xin
 * @Date 2020/4/7 18:10
 * @Version 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard //开启监控
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}
