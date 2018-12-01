package com.yefeng.mao.web;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.yefeng.mao.web.controllers.AdminController;
import com.jfinal.template.Engine;
import com.yefeng.mao.web.handler.AdminRoutes;
import com.yefeng.mao.web.handler.AutoBingRouters;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class Config extends JFinalConfig{
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add(new AutoBingRouters())
        .add("/", AdminController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8080, "/", 5);
    }
}
