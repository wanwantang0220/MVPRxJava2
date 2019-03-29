package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class ArticleInfo implements Serializable {

    private static final long serialVersionUID = -6979301436949579302L;

    // 文章内容
    private String articleContent;
    // 创建时间
    private String articleDate;
    // 是否上架:1、上架；2、下架
    private String articleDisplay;
    // 作者
    private String articleEditor;
    // 资讯主键ID
    private String articleId;
    // 关键字
    private String articleKeyword;
    // 图片
    private String articlePhoto;
    // 备注
    private String articleRemarks;
    // 标题
    private String articleTitle;
    // 部门id
    private String deptId;
    // 类型：1、资讯；2、轮播
    private String type;
    // 地址
    private String url;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleDisplay() {
        return articleDisplay;
    }

    public void setArticleDisplay(String articleDisplay) {
        this.articleDisplay = articleDisplay;
    }

    public String getArticleEditor() {
        return articleEditor;
    }

    public void setArticleEditor(String articleEditor) {
        this.articleEditor = articleEditor;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleKeyword() {
        return articleKeyword;
    }

    public void setArticleKeyword(String articleKeyword) {
        this.articleKeyword = articleKeyword;
    }

    public String getArticlePhoto() {
        return articlePhoto;
    }

    public void setArticlePhoto(String articlePhoto) {
        this.articlePhoto = articlePhoto;
    }

    public String getArticleRemarks() {
        return articleRemarks;
    }

    public void setArticleRemarks(String articleRemarks) {
        this.articleRemarks = articleRemarks;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
