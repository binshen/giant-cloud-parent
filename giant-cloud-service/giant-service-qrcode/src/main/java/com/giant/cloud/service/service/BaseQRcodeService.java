package com.giant.cloud.service.service;

import com.giant.cloud.model.qrcode.BaseQRcode;
import com.giant.cloud.service.mapper.BaseQRcodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseQRcodeService {

    @Autowired
    BaseQRcodeMapper baseQRcodeMapper;

    public List<BaseQRcode> selectAllBaseQRcode() {
        return baseQRcodeMapper.selectAllBaseQRcode();
    }

    public List<String> selectSku() {
        return baseQRcodeMapper.selectSku();
    }
}
