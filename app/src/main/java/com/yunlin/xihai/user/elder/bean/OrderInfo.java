package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class OrderInfo implements Serializable {

    private static final long serialVersionUID = -2680507990790137054L;
    // 服务地址
    private String address;
    // 关联订单信息（定金订单）
    private String assocOrderId;
    // 关联订单编号
    private String assocOrderNo;
    // 定金订单创建日期
    private String assocOrderTime;
    // 关联订单详情（定金金额）
    private double assocPrice;
    // 所属商家ID
    private String deptId;
    // 服务描述
    private String description;
    // 订单备注
    private String orderRemark;
    // 服务内容
    private String discountRemark;
    // 分配人员ID
    private String distributionId;
    // 服务名称
    private String name;
    // 服务小项
    private String orderDetail;
    // 订单折扣
    private String orderDiscount;
    // 订单评价
    private float orderEvaluate;
    // 评价内容
    private String orderEvaluateComment;
    // 订单ID
    private String orderId;
    // 订单编号
    private String orderNo;
    // 订单响应时间
    private String orderResponseTime;
    // 服务时间
    private String orderServerTime;
    // 订单状态
    private int orderStatus;
    // 订单创建日期
    private String orderTime;
    // 订单类别
    private int orderType;
    // 订单数量
    private double orderUnitNum;
    // 支付类型
    private int payType;
    // 照片
    private String photo;
    // 价格
    private double price;
    // 实付价格
    private double realPrice;
    // 业主折扣价格
    private double residentScalePrice;
    // 服务单价
    private double scalePrice;
    // 配送费
    private double sendPrice;
    // 订单服务类型名称
    private String serverCategoryName;
    // 服务结束时间
    private String serverEndTime;
    // 订单关联服务ID
    private String serverId;
    // 服务开始时间
    private String serverStartTime;
    // 服务人员主键ID
    private String staffId;
    // 服务人员姓名
    private String staffName;
    // 服务规格
    private String unit;
    // 规格单价
    private String unitPrice;
    // 下单用户主键ID
    private String userId;
    // 用户姓名
    private String userName;
    // 用户手机号
    private String userPhoneNumber;
    // 服务注意事项
    private String warnings;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAssocOrderId() {
        return assocOrderId;
    }

    public void setAssocOrderId(String assocOrderId) {
        this.assocOrderId = assocOrderId;
    }

    public String getAssocOrderNo() {
        return assocOrderNo;
    }

    public void setAssocOrderNo(String assocOrderNo) {
        this.assocOrderNo = assocOrderNo;
    }

    public String getAssocOrderTime() {
        return assocOrderTime;
    }

    public void setAssocOrderTime(String assocOrderTime) {
        this.assocOrderTime = assocOrderTime;
    }

    public double getAssocPrice() {
        return assocPrice;
    }

    public void setAssocPrice(double assocPrice) {
        this.assocPrice = assocPrice;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getDiscountRemark() {
        return discountRemark;
    }

    public void setDiscountRemark(String discountRemark) {
        this.discountRemark = discountRemark;
    }

    public String getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public float getOrderEvaluate() {
        return orderEvaluate;
    }

    public void setOrderEvaluate(float orderEvaluate) {
        this.orderEvaluate = orderEvaluate;
    }

    public String getOrderEvaluateComment() {
        return orderEvaluateComment;
    }

    public void setOrderEvaluateComment(String orderEvaluateComment) {
        this.orderEvaluateComment = orderEvaluateComment;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderResponseTime() {
        return orderResponseTime;
    }

    public void setOrderResponseTime(String orderResponseTime) {
        this.orderResponseTime = orderResponseTime;
    }

    public String getOrderServerTime() {
        return orderServerTime;
    }

    public void setOrderServerTime(String orderServerTime) {
        this.orderServerTime = orderServerTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public double getOrderUnitNum() {
        return orderUnitNum;
    }

    public void setOrderUnitNum(double orderUnitNum) {
        this.orderUnitNum = orderUnitNum;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
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

    public double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(double realPrice) {
        this.realPrice = realPrice;
    }

    public double getResidentScalePrice() {
        return residentScalePrice;
    }

    public void setResidentScalePrice(double residentScalePrice) {
        this.residentScalePrice = residentScalePrice;
    }

    public double getScalePrice() {
        return scalePrice;
    }

    public void setScalePrice(double scalePrice) {
        this.scalePrice = scalePrice;
    }

    public double getSendPrice() {
        return sendPrice;
    }

    public void setSendPrice(double sendPrice) {
        this.sendPrice = sendPrice;
    }

    public String getServerCategoryName() {
        return serverCategoryName;
    }

    public void setServerCategoryName(String serverCategoryName) {
        this.serverCategoryName = serverCategoryName;
    }

    public String getServerEndTime() {
        return serverEndTime;
    }

    public void setServerEndTime(String serverEndTime) {
        this.serverEndTime = serverEndTime;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerStartTime() {
        return serverStartTime;
    }

    public void setServerStartTime(String serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}
