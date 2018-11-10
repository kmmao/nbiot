package com.goldcard.nbiot.dao;

import com.goldcard.nbiot.model.OperLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：OperLogDao.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 10:03
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
@Mapper
public interface OperLogDao {
    /**
     * 新增操作日志
     *
     * @param operLog 操作日志对象
     */
    public void insertOperlog(OperLog operLog);

    /**
     * 查询系统操作日志集合
     *
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    public List<OperLog> selectOperLogList(OperLog operLog);

    /**
     * 批量删除系统操作日志
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public int batchDeleteOperLog(Long[] ids);

    /**
     * 查询操作日志详细
     *
     * @param operId 操作ID
     * @return 操作日志对象
     */
    public OperLog selectOperLogById(Long operId);

}
