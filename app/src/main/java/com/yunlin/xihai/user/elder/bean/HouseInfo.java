package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class HouseInfo implements Serializable {

    private static final long serialVersionUID = 8199496748721879252L;

    // 是否默认房屋
    private boolean defaultFamily;
    // 家庭地址
    private String address;
    // 家庭主键ID
    private String familyId;
    // 住户列表
    private ArrayList<ResidentInfo> residentList;

    public boolean isDefaultFamily() {
        return defaultFamily;
    }

    public void setDefaultFamily(boolean defaultFamily) {
        this.defaultFamily = defaultFamily;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public ArrayList<ResidentInfo> getResidentList() {
        return residentList;
    }

    public void setResidentList(ArrayList<ResidentInfo> residentList) {
        this.residentList = residentList;
    }
}
