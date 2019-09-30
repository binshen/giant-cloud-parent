package com.giant.cloud.service.api;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.giant.cloud.service.remote.QRcodeServiceRemote;
import com.giant.cloud.service.service.DataSourceTestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoApi {

    @Autowired
    private QRcodeServiceRemote qRcodeServiceRemote;


    @Autowired
    private DataSourceTestService dataSourceTestService;


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


    /**
     * 测试对【Master】数据源的调用
     * @return
     */
    @ResponseBody
    @RequestMapping("/master")
    public List<String> testMasterDataSource() {
        List<String> results = dataSourceTestService.testMaster();
        // 返回结果行数过多，此处暂时只返回前1000条记录
        return results.subList(0, 1000);
    }

    /**
     * 测试对【slave】数据源的调用
     * @return
     */
    @ResponseBody
    @RequestMapping("/slave")
    public List<String> testSlaveDataSource() {
        return dataSourceTestService.testSlave();
    }


    /**
     * 测试从携程Apollo配置中心获取动态配置信息
     * @return
     */
    @ApolloConfig
    private Config config;

    @Value("${userName}")
    private String userName;

    @ResponseBody
    @RequestMapping("/config")
    public String testApolloConfig() {
        return "Hello, " + userName + ", Your age is " + config.getProperty("userAge", "25");
    }
}
