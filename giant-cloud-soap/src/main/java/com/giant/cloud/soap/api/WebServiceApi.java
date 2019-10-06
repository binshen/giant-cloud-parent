package com.giant.cloud.soap.api;

import com.giant.cloud.soap.model.CustSerialNo;
import com.giant.cloud.soap.service.SerialNoService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseQRcode")
public class WebServiceApi {

    @RequestMapping("/getSerialNoBySerialNo")
    @ResponseBody
    public CustSerialNo getSerialNoBySerialNo(String qrCode){

        String endpoint = "http://datacenter.giant.com.tw/qrGiant/Service/SerialNoService.svc?wsdl";

        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        // 设置代理地址
        jaxWsProxyFactoryBean.setAddress(endpoint);
        // 设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(SerialNoService.class);
        // 创建一个代理接口实现
        SerialNoService serialNoService = (SerialNoService) jaxWsProxyFactoryBean.create();
        // 取得返回值
        CustSerialNo custSerialNo = serialNoService.getSerialNoBySerialNo(qrCode);

        return custSerialNo;
    }

    // 测试代码
    public static void main(String[] args) {

        String endpoint = "http://datacenter.giant.com.tw/qrGiant/Service/SerialNoService.svc?wsdl";

        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        // 设置代理地址
        jaxWsProxyFactoryBean.setAddress(endpoint);
        // 设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(SerialNoService.class);
        // 创建一个代理接口实现
        SerialNoService serialNoService = (SerialNoService) jaxWsProxyFactoryBean.create();

        CustSerialNo custSerialNo = serialNoService.getSerialNoBySerialNo("123");

        System.out.println(custSerialNo);
    }
}
