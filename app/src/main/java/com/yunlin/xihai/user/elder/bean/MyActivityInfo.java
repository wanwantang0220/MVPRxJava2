package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class MyActivityInfo implements Serializable {

    private static final long serialVersionUID = 5683107485880053132L;
    // 活动主键
    private String activityId;
    // 订单状态
    private int activityOrderStatus;
    // 订单状态名称
    private String activityOrderStatusName;
    // 订单类型
    private String activityOrderType;
    // 订单类型名称
    private String activityOrderTypeName;
    // 报名人手机号码
    private String mobile;
    // 报名人姓名
    private String name;
    // 报名人具体人数
    private String num;
    // 支付账号
    private String payAccount;
    // 支付时间
    private String payTime;
    // 支付渠道
    private String paymentChannel;
    // 活动报名主键
    private String signId;
    // 活动报名编号
    private String signNo;
    // 报名状态
    private String signStatus;
    // 报名状态名称
    private String signStatusName;
    // 报名总金额
    private String totalPrice;
    // 交易流水号
    private String tradeNo;
    // 报名人主键
    private String userId;
    //活动
    private ActivityInfo activity;
    //活动报名具体人员
    private ArrayList<SignInfo> activitySignitemList;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public int getActivityOrderStatus() {
        return activityOrderStatus;
    }

    public void setActivityOrderStatus(int activityOrderStatus) {
        this.activityOrderStatus = activityOrderStatus;
    }

    public String getActivityOrderStatusName() {
        return activityOrderStatusName;
    }

    public void setActivityOrderStatusName(String activityOrderStatusName) {
        this.activityOrderStatusName = activityOrderStatusName;
    }

    public String getActivityOrderType() {
        return activityOrderType;
    }

    public void setActivityOrderType(String activityOrderType) {
        this.activityOrderType = activityOrderType;
    }

    public String getActivityOrderTypeName() {
        return activityOrderTypeName;
    }

    public void setActivityOrderTypeName(String activityOrderTypeName) {
        this.activityOrderTypeName = activityOrderTypeName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public String getSignNo() {
        return signNo;
    }

    public void setSignNo(String signNo) {
        this.signNo = signNo;
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    public String getSignStatusName() {
        return signStatusName;
    }

    public void setSignStatusName(String signStatusName) {
        this.signStatusName = signStatusName;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ActivityInfo getActivity() {
        return activity;
    }

    public void setActivity(ActivityInfo activity) {
        this.activity = activity;
    }

    public ArrayList<SignInfo> getActivitySignitemList() {
        return activitySignitemList;
    }

    public void setActivitySignitemList(ArrayList<SignInfo> activitySignitemList) {
        this.activitySignitemList = activitySignitemList;
    }
}
