package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class BannerInfo implements Serializable {

    private static final long serialVersionUID = -4607087153386158683L;
    // 轮播图详情页面路径
    private String detailsUrl;
    // 轮播图唯一标识
    private String imgKey;
    // 轮播图名称
    private String imgName;
    // 轮播图类别 1-文章资讯 2-活动
    private int imgType;
    // 轮播图类别名称
    private String imgTypeName;
    // 轮播图片路径
    private String imgUrl;

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getImgKey() {
        return imgKey;
    }

    public void setImgKey(String imgKey) {
        this.imgKey = imgKey;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public int getImgType() {
        return imgType;
    }

    public void setImgType(int imgType) {
        this.imgType = imgType;
    }

    public String getImgTypeName() {
        return imgTypeName;
    }

    public void setImgTypeName(String imgTypeName) {
        this.imgTypeName = imgTypeName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
