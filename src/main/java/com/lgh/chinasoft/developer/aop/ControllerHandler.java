package com.lgh.chinasoft.developer.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/7.
 */
@Aspect
@Component
public class ControllerHandler {
    private static Logger logger = LoggerFactory.getLogger(ControllerHandler.class);
    @Pointcut("execution( * com.lgh.chinasoft.developer.controller.*.*(..))")
    public void pointCutAt() {
    }

    @Before("pointCutAt()")
    public void beforeAction(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method controller = signature.getMethod();
        logger.info("[time:{}] Start request method:{}",System.currentTimeMillis(),controller);
    }

    @After("pointCutAt()")
    public void afterAction(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method controller = signature.getMethod();
        logger.info("[time:{}] End request method:{}",System.currentTimeMillis(),controller);
    }
}
