package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeInfo implements Serializable {

    private static final long serialVersionUID = -2987591032086470689L;
    private ArrayList<BannerInfo> carouselList;
    private ArrayList<ServiceInfo> hotServerList;
    private ArrayList<ActivityInfo> activityList;
    private ArrayList<ArticleCategoryInfo> infoCateList;
    private ArrayList<ArticleInfo> infoList;

    public ArrayList<BannerInfo> getCarouselList() {
        return carouselList;
    }

    public void setCarouselList(ArrayList<BannerInfo> carouselList) {
        this.carouselList = carouselList;
    }

    public ArrayList<ServiceInfo> getHotServerList() {
        return hotServerList;
    }

    public void setHotServerList(ArrayList<ServiceInfo> hotServerList) {
        this.hotServerList = hotServerList;
    }

    public ArrayList<ActivityInfo> getActivityList() {
        return activityList;
    }

    public void setActivityList(ArrayList<ActivityInfo> activityList) {
        this.activityList = activityList;
    }

    public ArrayList<ArticleCategoryInfo> getInfoCateList() {
        return infoCateList;
    }

    public void setInfoCateList(ArrayList<ArticleCategoryInfo> infoCateList) {
        this.infoCateList = infoCateList;
    }

    public ArrayList<ArticleInfo> getInfoList() {
        return infoList;
    }

    public void setInfoList(ArrayList<ArticleInfo> infoList) {
        this.infoList = infoList;
    }
}
