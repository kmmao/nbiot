package com.goldcard.nbiot.annotation;

import java.lang.annotation.*;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：Log.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/9 13:44
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

    String title() default "";

    String action() default "";

    String channel() default "";
}
