package com.giant.cloud.service.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {

    @RequestMapping("/index")
    @ApiOperation("测试")
    public String showIndex() {
        return "Hello";
    }
}
