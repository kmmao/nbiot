package com.goldcard.nbiot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ----------------------------------------------------------------
 * Copyright (C) 2017 金卡高科技股份有限公司
 * 版权所有。
 * <p>
 * 文件名：LoginController.java
 * 文件功能描述：
 * <p>
 * 创建标识 mzkun
 * 创建时间 2018/11/1 13:50
 * <p>
 * 修改标识：
 * 修改描述：
 * ----------------------------------------------------------------
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
