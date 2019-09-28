package com.giant.cloud.service.api;

import com.giant.cloud.model.qrcode.BaseQRcode;
import com.giant.cloud.service.service.BaseQRcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/baseQRcode")
public class BaseQRcodeApi {

    @Autowired
    private BaseQRcodeService baseQRcodeService;

    @RequestMapping("/searchBaseQRcode")
    @ResponseBody
    public List<BaseQRcode> selectAllBaseQRcode() {
        return baseQRcodeService.selectAllBaseQRcode();
    }
}
