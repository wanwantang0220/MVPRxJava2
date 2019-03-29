package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class AddressInfo implements Serializable {

    private static final long serialVersionUID = 9202483242004726941L;
    // 主键ID
    private String id;
    // 具体地址
    private String address;
    // 主键ID
    private String addressId;
    // 省
    private String provinceName;
    // 市
    private String cityName;
    // 区县名称
    private String areaName;
    // 街道名称
    private String streetName;
    // 社区编码
    private String communityCode;
    // 社区名称
    private String communityName;
    // 创建时间
    private String createTime;
    // 是否为默认地址
    private boolean defaultAddress;
    // 是否在服务范围
    private boolean inRange;
    // 手机
    private String mobile;
    // 姓名
    private String name;
    // 类型：1、家庭 2、地址
    private String type;
    // 关联用户ID
    private String userId;
    // 折扣比例
    private double scalePrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public boolean isDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public boolean isInRange() {
        return inRange;
    }

    public void setInRange(boolean inRange) {
        this.inRange = inRange;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getScalePrice() {
        return scalePrice;
    }

    public void setScalePrice(double scalePrice) {
        this.scalePrice = scalePrice;
    }
}
