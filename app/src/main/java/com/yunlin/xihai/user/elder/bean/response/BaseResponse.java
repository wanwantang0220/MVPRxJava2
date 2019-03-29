package com.yunlin.xihai.user.elder.bean.response;

import com.yunlin.xihai.user.elder.bean.BaseModel;

import java.io.Serializable;

public class BaseResponse extends BaseModel implements Serializable {

    private static final long serialVersionUID = 4148694402814041292L;
    private int code;
    private String msg;
    private String currentTime;


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

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

}
