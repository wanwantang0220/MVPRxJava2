package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class SignInfo implements Serializable {

    private static final long serialVersionUID = -6837345771807589124L;
    // 创建时间
    private String createTime;
    // 主键
    private String itemId;
    // 人员手机号
    private String mobile;
    // 人员姓名
    private String name;
    // 活动报名主键
    private String siginId;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiginId() {
        return siginId;
    }

    public void setSiginId(String siginId) {
        this.siginId = siginId;
    }
}
