package com.giant.cloud.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="giant-service-web")
public interface WebTestServiceRemote {

    @RequestMapping("/web/test")
    String getTest();
}
