package com.goldcard.nbiot.model;

import com.goldcard.nbiot.common.enums.ErrorCodeEnums;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：Result.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/10/31 15:39
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T result;

    public static Result ok(Object obj) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("ok");
        result.setResult(obj);
        return result;
    }

    public static Result ok() {
        return ok(null);
    }

    /**
     * 自定义错误信息
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setResult(null);
        return result;
    }

    /**
     * 返回已知范围的异常信息
     * @param codeEnums
     * @return
     */
    public static Result error(ErrorCodeEnums codeEnums) {
        Result result = new Result();
        result.setCode(codeEnums.getCode());
        result.setMsg(codeEnums.getMsg());
        result.setResult(null);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(msg);
        result.setResult(null);
        return result;
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
