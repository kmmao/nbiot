package com.goldcard.nbiot.model;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：OperLog.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 09:53
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class OperLog {
    private int operId;
    private String title;
    private String action;
    private String method;
    private String channel;
    private String operName;
    private String operUrl;
    private String operIp;
    private String operParam;
    private int status;
    private String errorMsg;
    private String operTime;

    public int getOperId() {
        return operId;
    }

    public void setOperId(int operId) {
        this.operId = operId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    public String getOperParam() {
        return operParam;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }
}
