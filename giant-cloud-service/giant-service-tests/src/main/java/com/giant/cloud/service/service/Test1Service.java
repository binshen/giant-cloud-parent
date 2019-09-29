package com.giant.cloud.service.service;

import com.giant.cloud.service.config.Master;
import com.giant.cloud.service.config.Slave;

public class Test1Service {

    @Slave
    public void select() {

    }

    @Master
    public void insert() {

    }
}
