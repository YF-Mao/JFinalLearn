package com.yefeng.mao.web.utils;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/1
 **/
public class CUtilResponse {
    public static class Response {
        private int code;
        private String msg;

        public Response(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
