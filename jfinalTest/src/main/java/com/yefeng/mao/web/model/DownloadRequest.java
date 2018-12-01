package com.yefeng.mao.web.model;

import com.yefeng.mao.web.utils.CUtilRequest.Request;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class DownloadRequest extends Request{
    private int id;
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
