package com.goldcard.nbiot.service.impl;

import com.goldcard.nbiot.model.OperLog;
import com.goldcard.nbiot.service.OperLogService;

import java.util.List;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：OperLogServiceImpl.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 13:49
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
public class OperLogServiceImpl implements OperLogService {
    @Override
    public void insertOperlog(OperLog operLog) {

    }

    @Override
    public List<OperLog> selectOperLogList(OperLog operLog) {
        return null;
    }

    @Override
    public int batchDeleteOperLog(Long[] ids) {
        return 0;
    }

    @Override
    public OperLog selectOperLogById(Long operId) {
        return null;
    }
}
