package com.goldcard.nbiot.utils;

import com.goldcard.nbiot.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：ShiroUtils.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 15:34
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class ShiroUtils {
    public static Subject getSubjct() {
        return SecurityUtils.getSubject();
    }

    public static void logout() {
        getSubjct().logout();
    }

    public static User getUser() {
        return (User) getSubjct().getPrincipal();
    }

    public static Long getUserId() {
        return getUser().getUserId().longValue();
    }

    public static String getUserName() {
        return getUser().getUserName();
    }

    public static String getIp() {
        return getSubjct().getSession().getHost();
    }

    public static String getSessionId() {
        return String.valueOf(getSubjct().getSession().getId());
    }
}
