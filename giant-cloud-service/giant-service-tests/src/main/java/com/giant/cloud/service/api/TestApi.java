package com.giant.cloud.service.api;

import com.giant.cloud.service.remote.QRcodeServiceRemote;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestApi {

    @Autowired
    private QRcodeServiceRemote qRcodeServiceRemote;


    /**
     * 测试接口
     * @return
     */
    @RequestMapping("/index")
    @HystrixCommand(fallbackMethod = "doTestFallback")
    public String index() {
        List<String> skuList = qRcodeServiceRemote.selectSku();

        //此处可以实现一堆业务逻辑
        return StringUtils.join(skuList.toArray(), ",");
    }

    /**
     * 熔断处理函数：
     *     当qRcodeServiceRemote.selectSku返回异常时，
     *     此处doTestFallback方法会被自动调用。
     *     此处可以根据业务需求做一些善后处理，以保证整个调用链不会异常而瘫痪。
     * @return
     */
    String doTestFallback() {
        return "服务器故障，请稍后重试";
    }
}
