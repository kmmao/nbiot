package com.goldcard.nbiot.common.enums;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：ErrorCode.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/10/31 15:36
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public enum ErrorCodeEnums {

    SUCCESS(0, "success");

    private Integer code;
    private String msg;

    ErrorCodeEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
