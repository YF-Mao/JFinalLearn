package com.yefeng.mao.web.controllers;

import com.yefeng.mao.web.model.DownloadRequest;
import com.yefeng.mao.web.utils.CUtilResponse;
import com.yefeng.mao.web.utils.CUtilResponse.Response;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class ExternalCallController extends AuthController{

    public void index() {
        renderJson(new Response(0, "20181201"));
    }

    public void download() {
        DownloadRequest req = getNoTokenParaObjectFromGet(DownloadRequest.class);
        renderJson(req);
    }
}
