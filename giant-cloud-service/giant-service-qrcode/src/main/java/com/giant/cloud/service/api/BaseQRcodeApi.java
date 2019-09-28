package com.giant.cloud.service.api;

import com.giant.cloud.model.qrcode.BaseQRcode;
import com.giant.cloud.service.service.BaseQRcodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/baseQRcode")
@Api
public class BaseQRcodeApi {

    @Autowired
    private BaseQRcodeService baseQRcodeService;

    @ResponseBody
    @RequestMapping("/searchBaseQRcode")
    @ApiOperation("获取所有QRcode列表")
    public List<BaseQRcode> selectAllBaseQRcode() {
        return baseQRcodeService.selectAllBaseQRcode();
    }

    @ResponseBody
    @RequestMapping("/selectSku")
    @ApiOperation("获取所有Sku列表")
    public List<String> selectSku() {
        return baseQRcodeService.selectSku();
    }
}
