package com.giant.cloud.service.service;

import com.giant.cloud.service.config.Master;
import com.giant.cloud.service.config.Slave;
import com.giant.cloud.service.mapper.BikeMapper;
import com.giant.cloud.service.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSourceTestService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BikeMapper bikeMapper;

    @Master
    public List<String> testMaster() {
        return userMapper.getUserList();
    }

    @Slave
    public List<String> testSlave() {
        return bikeMapper.getBikeList();
    }
}
