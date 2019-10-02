package com.giant.cloud.gateway.api;

import com.giant.cloud.gateway.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Response fallback() {
        Response response = new Response();
        response.setCode(-1);
        response.setMessage("服务暂时不可用");
        return response;
    }
}
