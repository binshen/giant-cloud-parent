package com.giant.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 捷安特微服务示例（测试代码）
 */

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class TestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestsApplication.class, args);
    }
}
