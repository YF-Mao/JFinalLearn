package com.yefeng.mao.web.controllers;

import com.alibaba.fastjson.JSON;
import com.jfinal.core.Controller;
import com.yefeng.mao.web.utils.CUtilRequest.Request;

import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class AuthController extends Controller{
    private  <T extends Request> T getParaFromRequest(Class<T> clazz) {
        String data;
        StringBuilder builder = new StringBuilder("{");
        Map<String, String[]> map = getRequest().getParameterMap();
        if (map.isEmpty()) {
            return null;
        }
        for (Map.Entry<String, String[]> pair : map.entrySet()) {
            String key = pair.getKey();
            String[] values = pair.getValue();
            builder.append("\"" + key + "\":\"" + values[0] + "\",");
        }
        builder.append("}").replace(builder.length() - 2 , builder.length() - 1, "");
        data = builder.toString();
        T o = JSON.parseObject(data, clazz);

        return o;
    }

    private boolean isAuthenticated(Request req) {
        if (getRequest().getServletPath().equalsIgnoreCase("/extCall/download")) {
            return true;
        } else {
            return false;
        }
    }

    protected <T extends Request> T getNoTokenParaObjectFromGet(Class<T> clazz) {
        return getParaFromRequest(clazz);
    }
}
