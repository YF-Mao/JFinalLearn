package com.yefeng.mao.web.handler;

import com.jfinal.config.Routes;
import com.yefeng.mao.web.controllers.AdminController;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class AdminRoutes extends Routes{
    @Override
    public void config() {
        add("/admin", AdminController.class);
    }
}
