package com.goldcard.nbiot;

import com.goldcard.nbiot.dao.OperLogDao;
import com.goldcard.nbiot.model.OperLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：LogTest.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 11:05
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

    @Autowired
    private OperLogDao operLogDao;

    @Test
    public void testLog() {
        OperLog operLog = new OperLog();
        operLog.setOperId(3);
        operLogDao.insertOperlog(operLog);
    }
}
