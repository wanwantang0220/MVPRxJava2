package com.yunlin.xihai.user.elder.bean;

import org.jaaksi.pickerview.dataset.OptionDataSet;

import java.io.Serializable;
import java.util.List;

public class FamilyInfo implements Serializable, OptionDataSet {

    private static final long serialVersionUID = -8082694040193731332L;
    // 位置
    private String address;
    // 区号
    private String areaNumber;
    // 户主生日
    private String birthday;
    // 楼栋
    private String buildingNumber;
    // 所属社区code
    private String communityCode;
    // 社区名称
    private String communityName;
    // 管辖部门id
    private String deptId;
    // 部门名称
    private String deptName;
    // 家庭ID
    private String familyId;
    // 户主
    private String houseHolder;
    // 户主联系方式
    private String phoneNumber;
    // 室号
    private String roomNumber;
    // 户主性别
    private String sexName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
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

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getHouseHolder() {
        return houseHolder;
    }

    public void setHouseHolder(String houseHolder) {
        this.houseHolder = houseHolder;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    @Override
    public List<? extends OptionDataSet> getSubs() {
        return null;
    }

    @Override
    public String getValue() {
        return familyId;
    }

    @Override
    public CharSequence getCharSequence() {
        return address;
    }
}
