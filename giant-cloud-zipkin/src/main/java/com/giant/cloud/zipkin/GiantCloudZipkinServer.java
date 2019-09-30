package com.giant.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class GiantCloudZipkinServer {

    public static void main(String[] args) {
        SpringApplication.run(GiantCloudZipkinServer.class, args);
    }
}