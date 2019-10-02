package com.giant.cloud.gateway.filter;

import com.giant.cloud.gateway.model.Response;
import com.giant.cloud.gateway.utils.JwtUtil;
import com.google.gson.Gson;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

//@Component
public class JwtAuthGlobalFilter implements GlobalFilter, Ordered {

//    @Value("${auth.skip.urls}")
//    private String[] skipAuthUrls;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

//        String url = exchange.getRequest().getURI().getPath();
//        //跳过不需要验证的路径
//        if(Arrays.asList(skipAuthUrls).contains(url)){
//            return chain.filter(exchange);
//        }

        //从请求头中取出token
        Gson gson = new Gson();
        String token = exchange.getRequest().getHeaders().getFirst("Authorization");
        if(StringUtils.isEmpty(token)){
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.OK);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");

            Response res = new Response(401, "401 unauthorized");
            byte[] responseByte = gson.toJson(res).getBytes(StandardCharsets.UTF_8);

            DataBuffer buffer = response.bufferFactory().wrap(responseByte);
            return response.writeWith(Flux.just(buffer));
        }

        boolean verifyResult = JwtUtil.verify(token);
        if(!verifyResult){
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.OK);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");

            Response res = new Response(1000, "invalid token");
            byte[] responseByte = gson.toJson(res).getBytes(StandardCharsets.UTF_8);

            DataBuffer buffer = response.bufferFactory().wrap(responseByte);
            return response.writeWith(Flux.just(buffer));
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 1;
    }
}
