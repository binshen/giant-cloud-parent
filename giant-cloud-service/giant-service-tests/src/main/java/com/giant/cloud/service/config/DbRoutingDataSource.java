package com.giant.cloud.service.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DbRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}
