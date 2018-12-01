package com.yefeng.mao.web.handler;

import com.jfinal.config.Routes;
import com.yefeng.mao.web.controllers.ExternalCallController;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class AutoBingRouters extends Routes{
    @Override
    public void config() {
        add("/extCall", ExternalCallController.class);
    }
}
