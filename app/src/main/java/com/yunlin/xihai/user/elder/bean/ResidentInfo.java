package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class ResidentInfo implements Serializable {

    private static final long serialVersionUID = -6116292692793770259L;
    // 家庭地址
    private String address;
    // 生日
    private String birthday;
    // 小区id
    private String deptId;
    // 紧急联系人
    private String emergencyContactName;
    // 紧急联系人电话
    private String emergencyContactPhoneNumber;
    // 家庭主键ID
    private String familyId;
    // 头像
    private String headPhoto;
    // 身份证号码
    private String idCard;
    // 是否是户主(0、否；1、是)
    private String isHouseholder;
    // 是否激活(0、激活；1、锁定)
    private String locked;
    // 是否结婚：1、是；0、否
    private String married;
    // 姓名
    private String name;
    // 民族
    private String nation;
    // 籍贯
    private String nativePlace;
    // 电话号码
    private String phoneNumber;
    // 与户主关系id：1、户主；2、住户；3、租户
    private String relationShip;
    // 与户主关系名称
    private String relationShipName;
    // 住户主键ID
    private String residentId;
    // 性别：1、男；2、女；3、未知
    private String sex;
    // 性别名称
    private String sexName;
    // 用户id
    private String userId;
    // 省份
    private String provinceCode;
    // 省份名称
    private String provinceName;
    // 市
    private String cityCode;
    // 市名称
    private String cityName;
    // 县/区
    private String areaCode;
    // 县/区名称
    private String areaName;
    // 街道
    private String streetCode;
    // 街道名称
    private String streetName;
    // 小区
    private String communityCode;
    // 小区名称
    private String communityName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }

    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIsHouseholder() {
        return isHouseholder;
    }

    public void setIsHouseholder(String isHouseholder) {
        this.isHouseholder = isHouseholder;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    public String getRelationShipName() {
        return relationShipName;
    }

    public void setRelationShipName(String relationShipName) {
        this.relationShipName = relationShipName;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
