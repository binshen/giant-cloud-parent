package com.giant.cloud.model.qrcode;

import com.giant.cloud.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class BaseQRcode extends BaseModel {

    //主键id
    private Integer id;
    //车辆名称
    private String name;
    //状态0-正常1-丢失2-找回
    private String status;
    //sku
    private String sku;
    //是否异常数据1-是0-否
    private String isExData;
    //二维码信息
    private String qrcode;
    //验证码
    private String ident;
    //车架号
    private String vinno;
    //是否激活1-是0-否
    private String actStatus;
    //激活码
    private String actCode;
    //门店编码
    private String storeCode;
    //是否绑定1-是0-否
    private String bdStatus;
    //用户id
    private Integer userId;
    //激活时间
    private String actDate;
    //绑定时间
    private String bindDate;
    //生产日期
    private String proddate;
    //生产工厂
    private String prodfact;
    //MO
    private String mono;
    //线别
    private String lineid;
    //车架号码记录时间
    private String frameDate;
    //验证码扫描时间
    private String chkdate;
    //qrcode扫描时间
    private String qrdate;
    //上传状态Y/N/A
    private String uploadstat;
    //上传时间
    private String uploaddate;
    //车架尺寸
    private String partSize;
    //车型名称
    private String nameBrief;
    //创建日期
    private String createDate;
    //更新日期
    private String updateDate;
    //SKU是否录入1-是0-否
    private String ifSkuIn;
    //是否结账
    private String state;
    //电机编码
    private String motorNumber;
    //合格证编号
    private String certNo;
    //查询使用  图片
    private List<String> imageList;
}
