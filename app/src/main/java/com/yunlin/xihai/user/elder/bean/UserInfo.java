package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = -1438101279102879538L;
    private String userId;
    private String userName;
    private String mobile;
    private String identity;
    private String token;
    private long expire;
    private ServiceAreaInfo serverArea;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    public ServiceAreaInfo getServerArea() {
        return serverArea;
    }

    public void setServerArea(ServiceAreaInfo serverArea) {
        this.serverArea = serverArea;
    }
}
