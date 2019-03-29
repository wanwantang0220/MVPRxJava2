package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class CityInfo implements Serializable {

    private static final long serialVersionUID = 5861968221322868441L;
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
