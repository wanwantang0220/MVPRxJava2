package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ServiceListInfo implements Serializable {

    private static final long serialVersionUID = 643731297825031318L;
    private int totalCount;
    private int pageSize;
    private int totalPage;
    private int currPage;

    private ArrayList<ServiceInfo> list;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public ArrayList<ServiceInfo> getList() {
        return list;
    }

    public void setList(ArrayList<ServiceInfo> list) {
        this.list = list;
    }
}
