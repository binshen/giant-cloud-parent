package com.giant.cloud.service.mapper;

import com.giant.cloud.model.qrcode.BaseQRcode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseQRcodeMapper {

    List<BaseQRcode> selectAllBaseQRcode();

    List<String> selectSku();
}
