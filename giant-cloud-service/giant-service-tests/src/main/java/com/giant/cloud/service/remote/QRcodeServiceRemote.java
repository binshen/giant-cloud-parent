package com.giant.cloud.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="giant-service-qrcode")
public interface QRcodeServiceRemote {

    @RequestMapping("/baseQRcode/selectSku")
    List<String> selectSku();
}
