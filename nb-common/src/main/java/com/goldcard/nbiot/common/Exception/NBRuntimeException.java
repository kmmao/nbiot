package com.goldcard.nbiot.common.Exception;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：NBRuntimeException.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/10/31 15:35
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class NBRuntimeException extends BaseException {

    private static final long serialVersionUID = 1L;

    public NBRuntimeException(String module, String code, String msg) {
        super(module, code, msg);
    }

}
