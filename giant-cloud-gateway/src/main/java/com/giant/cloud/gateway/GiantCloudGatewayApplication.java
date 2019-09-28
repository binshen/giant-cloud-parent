package com.giant.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GiantCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiantCloudGatewayApplication.class, args);
    }

//    @RequestMapping("/fallback_qrcode")
//    public Mono<String> fallback_qrcode() {
//        return Mono.just("fallback_qrcode");
//    }
}
