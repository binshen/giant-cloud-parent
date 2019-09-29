package com.giant.cloud.service.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SlaveInterceptor implements Ordered {

    @Around("@annotation(salve)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, Slave salve) throws Throwable {
        try {
            DbContextHolder.setDbType(DbContextHolder.DbType.SLAVE);
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
