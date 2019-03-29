package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class AlipayInfo implements Serializable {

    private static final long serialVersionUID = 8819597979599121416L;
    private String payInfo;

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }
}
