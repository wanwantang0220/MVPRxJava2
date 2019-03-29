package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class CommunityInfo implements Serializable {

    private static final long serialVersionUID = 2559060804321649236L;
    // 所属县区code
    private String areaCode;
    // 县/区名称
    private String areaName;
    // 所属市code
    private String cityCode;
    // 市名称
    private String cityName;
    // 小区编码
    private String code;
    // 小区Id
    private String communityId;
    // 所属部门
    private String deptId;
    // 部门名称
    private String deptName;
    // 是否为公司所辖小区
    private String familyLocation;
    // 纬度
    private double lat;
    // 经度
    private double lng;
    // 小区名称
    private String name;
    // 点坐标
    private String point;
    // 所属省份code
    private String provinceCode;
    // 省份名称
    private String provinceName;
    // 所属街道code
    private String streetCode;
    // 街道名称
    private String streetName;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFamilyLocation() {
        return familyLocation;
    }

    public void setFamilyLocation(String familyLocation) {
        this.familyLocation = familyLocation;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
