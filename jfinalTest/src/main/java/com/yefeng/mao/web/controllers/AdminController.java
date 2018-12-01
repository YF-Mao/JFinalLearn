package com.yefeng.mao.web.controllers;

import com.jfinal.core.Controller;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class AdminController extends Controller{
    public void index() {
        renderText("后台主页");
    }
}
