package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class ServiceCategoryInfo implements Serializable {

    private static final long serialVersionUID = 599866961134833798L;
    // 类别ID
    private String categoryId;
    // 类别名称
    private String categoryName;
    // 上级类别id
    private String categoryParentId;
    // 上级类别名称
    private String categoryParentName;
    // 所属商家id
    private String deptId;
    // 所属商家名称
    private String deptName;
    // 分类图片
    private String photo;
    // 是否下架 0-否 1-是
    private int putOn;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(String categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public String getCategoryParentName() {
        return categoryParentName;
    }

    public void setCategoryParentName(String categoryParentName) {
        this.categoryParentName = categoryParentName;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPutOn() {
        return putOn;
    }

    public void setPutOn(int putOn) {
        this.putOn = putOn;
    }
}
