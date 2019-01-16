package com.feri.common.vo;

import java.io.Serializable;

/**
 *@Author feri
 *@Date Created in 2019/1/15 09:43
 * 非分页查询结果集
 */
public class ResultVO implements Serializable {
    private int code;
    private String msg;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
