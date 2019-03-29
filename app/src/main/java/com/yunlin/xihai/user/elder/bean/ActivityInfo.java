package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ActivityInfo implements Serializable {

    private static final long serialVersionUID = -3357474170411044944L;
    // 活动Id
    private String activityId;
    // 活动地址
    private String addr;
    // 活动所属区域Id
    private String areaId;
    // 所属区域名称
    private String areaName;
    // 活动开始时间
    private String bgDate;
    // 活动类型
    private String cateId;
    // 活动类型名称
    private String cateName;
    // 活动是否启动
    private int closed;
    // 活动启动状态
    private String closedName;
    // 可见小区集合
    private ArrayList<CommunityInfo> communityEntityList;
    // 可见小区主键集合
    private ArrayList<Integer> communityIds;
    // 可见小区名称集合
    private String communityNames;
    // 联系电话
    private String contactNumber;
    // 活动创建时间
    private String createTime;
    // 活动所属部门
    private String deptId;
    // 所属部门名称
    private String deptName;
    // 活动内容
    private String details;
    // 活动结束时间
    private String endDate;
    // 活动简介
    private String introduce;
    // 活动是否首页轮播
    private String isCarousel;
    // 活动是否首页轮播
    private String isCarouselName;
    // 活动可参与人数
    private String jionNum;
    // 活动主管
    private String manager;
    // 主管名称
    private String managerName;
    // 活动排序
    private String orderby;
    // 活动标题图片
    private String photo;
    // 价格
    private double price;
    // 报名截止时间
    private String signEnd;
    // 已报名人数
    private String signNum;
    // 活动状态 0-未开启 1-已满员 2-已截止 3-已结束 4-已开启
    private int status;
    // 活动状态名称
    private String statusName;
    // 活动名称
    private String title;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getBgDate() {
        return bgDate;
    }

    public void setBgDate(String bgDate) {
        this.bgDate = bgDate;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getClosed() {
        return closed;
    }

    public void setClosed(int closed) {
        this.closed = closed;
    }

    public String getClosedName() {
        return closedName;
    }

    public void setClosedName(String closedName) {
        this.closedName = closedName;
    }

    public ArrayList<CommunityInfo> getCommunityEntityList() {
        return communityEntityList;
    }

    public void setCommunityEntityList(ArrayList<CommunityInfo> communityEntityList) {
        this.communityEntityList = communityEntityList;
    }

    public ArrayList<Integer> getCommunityIds() {
        return communityIds;
    }

    public void setCommunityIds(ArrayList<Integer> communityIds) {
        this.communityIds = communityIds;
    }

    public String getCommunityNames() {
        return communityNames;
    }

    public void setCommunityNames(String communityNames) {
        this.communityNames = communityNames;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getIsCarousel() {
        return isCarousel;
    }

    public void setIsCarousel(String isCarousel) {
        this.isCarousel = isCarousel;
    }

    public String getIsCarouselName() {
        return isCarouselName;
    }

    public void setIsCarouselName(String isCarouselName) {
        this.isCarouselName = isCarouselName;
    }

    public String getJionNum() {
        return jionNum;
    }

    public void setJionNum(String jionNum) {
        this.jionNum = jionNum;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSignEnd() {
        return signEnd;
    }

    public void setSignEnd(String signEnd) {
        this.signEnd = signEnd;
    }

    public String getSignNum() {
        return signNum;
    }

    public void setSignNum(String signNum) {
        this.signNum = signNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
