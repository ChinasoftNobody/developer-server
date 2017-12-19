package com.lgh.chinasoft.developer.aop;

import com.lgh.chinasoft.developer.common.Response;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *
 * @author Administrator
 * @date 2017/5/7
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

    @Around("pointCutAt()")
    public Object aroundAction(ProceedingJoinPoint joinPoint){
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error("method execute thrown a exception:" + throwable.getMessage());
            return new Response(false,throwable.getMessage());
        }
    }

    @After("pointCutAt()")
    public void afterAction(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method controller = signature.getMethod();
        logger.info("[time:{}] End request method:{}",System.currentTimeMillis(),controller);
    }
}
