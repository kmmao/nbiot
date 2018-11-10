package com.goldcard.nbiot.model;

import java.io.Serializable;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：User.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/10/31 15:30
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class User implements Serializable {

    private Long userId;
    private String userName;
    private String password;
    private String createTime;
    private String desc;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
