package com.giant.cloud.service.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MasterInterceptor implements Ordered {

    @Around("@annotation(master)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, Master master) throws Throwable {
        try {
            DbContextHolder.setDbType(DbContextHolder.DbType.MASTER);
            return proceedingJoinPoint.proceed();
        } finally {
            DbContextHolder.clearDbType();
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
