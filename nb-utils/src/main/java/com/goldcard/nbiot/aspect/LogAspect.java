package com.goldcard.nbiot.aspect;

import com.goldcard.nbiot.annotation.Log;
import com.goldcard.nbiot.model.OperLog;
import com.goldcard.nbiot.model.User;
import com.goldcard.nbiot.utils.ShiroUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：LogAspect.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 13:56
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
@Aspect
@Component
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // 配置织入点
    @Pointcut("@annotation(com.goldcard.nbiot.annotation.Log)")
    public void logPointCut() {
    }

    @AfterReturning(pointcut = "logPointCut()")
    public void doBefor(JoinPoint joinPoint) {
        handleLog(joinPoint, null);
    }

    private void handleLog(JoinPoint joinpoint, Exception e) {

        try {
            Log log = getAnnotationLog(joinpoint);

            if (null == log) {
                return;
            }
            // 获取当前的用户
            User currentUser = ShiroUtils.getUser();

            // *========数据库日志=========*//
            OperLog operLog = new OperLog();
            /*operLog.setStatus(UserConstants.NORMAL);
            // 请求的地址
            String ip = ShiroUtils.getIp();
            operLog.setOperIp(ip);
            operLog.setOperUrl(ServletUtils.getHttpServletRequest().getRequestURI());
            if (currentUser != null) {
                operLog.setOperName(currentUser.getUserName());
            }

            if (e != null) {
                operLog.setStatus(UserConstants.EXCEPTION);
                operLog.setErrorMsg(e.getMessage().substring(0, 2000));
            }
            // 设置方法名称
            String className = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            operLog.setMethod(className + "." + methodName + "()");
            // 处理设置注解上的参数
            getControllerMethodDescription(controllerLog, operLog);
            // 保存数据库
            operLogService.insertOperlog(operLog);*/

        } catch (Exception e1) {
            logger.error("==前置通知异常==");
            logger.error("异常信息：{}" + e1.getMessage());
            e1.printStackTrace();
        }
    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private static Log getAnnotationLog(JoinPoint joinPoint) throws Exception {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null) {
            return method.getAnnotation(Log.class);
        }
        return null;
    }
}
