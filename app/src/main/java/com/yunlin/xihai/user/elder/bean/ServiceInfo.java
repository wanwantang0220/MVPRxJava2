package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ServiceInfo implements Serializable {

    private static final long serialVersionUID = -2376258958205134440L;
    // 是否需要预约 0-否 1-是
    private int appointment;
    // 商家id
    private String deptId;
    // 商家名称
    private String deptName;
    // 服务描述
    private String description;
    // 服务细节
    private String details;
    // 是否上架 0-否 1-是
    private String display;
    // 定金
    private double earnestPrice;
    // 服务计费规格 id
    private String feeScaleId;
    // 展示图片
    private String photo;
    // 价格
    private double price;
    // 服务计费规格 业主折扣价格
    private double residentScalePrice;
    // 服务计费规格 规格描述
    private String scaleDescription;
    // 服务计费规格 标准价格
    private double scalePrice;
    // 服务计费规格 单位
    private String scaleUnit;
    // 服务ID
    private String serverId;
    // 服务名称
    private String serverName;
    // 服务类别id
    private String serverCategoryId;
    // 服务类别名称
    private String serverCategoryName;
    // 单位
    private String unit;
    // 注意事项
    private String warnings;
    // 地址列表
    private ArrayList<FamilyInfo> familyList;
    // 是否热门服务 0-否 1-是
    private String isHot;
    // 标题颜色
    private String titleBackground;
    // 背景颜色
    private String background;
    // 服务详情url
    private String url;
    // 服务地址
    private AddressInfo defaultAddress;
    private String appointmentName;
    private String displayName;
    private String detailInformation;
    private int businessId;
    private String businessName;
    private ArrayList<DiscountLink> discountLinkList;

    private Discountdetail discountdetail;


    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public double getEarnestPrice() {
        return earnestPrice;
    }

    public void setEarnestPrice(double earnestPrice) {
        this.earnestPrice = earnestPrice;
    }

    public String getFeeScaleId() {
        return feeScaleId;
    }

    public void setFeeScaleId(String feeScaleId) {
        this.feeScaleId = feeScaleId;
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

    public double getResidentScalePrice() {
        return residentScalePrice;
    }

    public void setResidentScalePrice(double residentScalePrice) {
        this.residentScalePrice = residentScalePrice;
    }

    public String getScaleDescription() {
        return scaleDescription;
    }

    public void setScaleDescription(String scaleDescription) {
        this.scaleDescription = scaleDescription;
    }

    public double getScalePrice() {
        return scalePrice;
    }

    public void setScalePrice(double scalePrice) {
        this.scalePrice = scalePrice;
    }

    public String getScaleUnit() {
        return scaleUnit;
    }

    public void setScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerCategoryId() {
        return serverCategoryId;
    }

    public void setServerCategoryId(String serverCategoryId) {
        this.serverCategoryId = serverCategoryId;
    }

    public String getServerCategoryName() {
        return serverCategoryName;
    }

    public void setServerCategoryName(String serverCategoryName) {
        this.serverCategoryName = serverCategoryName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public ArrayList<FamilyInfo> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(ArrayList<FamilyInfo> familyList) {
        this.familyList = familyList;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getTitleBackground() {
        return titleBackground;
    }

    public void setTitleBackground(String titleBackground) {
        this.titleBackground = titleBackground;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AddressInfo getDefaultAddress() {
        return defaultAddress;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName) {
        this.appointmentName = appointmentName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDetailInformation() {
        return detailInformation;
    }

    public void setDetailInformation(String detailInformation) {
        this.detailInformation = detailInformation;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public ArrayList<DiscountLink> getDiscountLinkList() {
        return discountLinkList;
    }

    public void setDiscountLinkList(ArrayList<DiscountLink> discountLinkList) {
        this.discountLinkList = discountLinkList;
    }

    public Discountdetail getDiscountdetail() {
        return discountdetail;
    }

    public void setDiscountdetail(Discountdetail discountdetail) {
        this.discountdetail = discountdetail;
    }

    public void setDefaultAddress(AddressInfo defaultAddress) {
        this.defaultAddress = defaultAddress;



    }
}
