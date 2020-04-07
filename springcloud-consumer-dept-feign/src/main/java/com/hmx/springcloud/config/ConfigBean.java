package com.hmx.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigBean
 * @Description TODO
 * @Author xin
 * @Date 2020/4/6 19:29
 * @Version 1.0
 **/
@Configuration
public class ConfigBean {
    //配置负载均衡实现
    //IRule
    //RoundRobbinRule轮询
    //RandomRule随机
    //RetryRule重试
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    //开启随机
//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
}
