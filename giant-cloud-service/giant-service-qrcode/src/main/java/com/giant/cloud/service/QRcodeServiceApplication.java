package com.giant.cloud.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.giant.cloud.service.mapper")
@ServletComponentScan("com.giant.cloud.service.filter")
@SpringBootApplication
public class QRcodeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QRcodeServiceApplication.class, args);
    }
}
