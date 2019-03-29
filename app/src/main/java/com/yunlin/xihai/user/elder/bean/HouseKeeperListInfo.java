package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class HouseKeeperListInfo implements Serializable {

    private static final long serialVersionUID = 2664141753580521351L;
    private String description;
    private ArrayList<EmployeeInfo> stewardList;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<EmployeeInfo> getStewardList() {
        return stewardList;
    }

    public void setStewardList(ArrayList<EmployeeInfo> stewardList) {
        this.stewardList = stewardList;
    }
}
