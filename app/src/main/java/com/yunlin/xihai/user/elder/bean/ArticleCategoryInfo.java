package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class ArticleCategoryInfo implements Serializable {

    private static final long serialVersionUID = 5847370774953525002L;
    // 资讯类别id
    private String articleTypeId;
    // 资讯类别名称
    private String articleTypeName;

    public String getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(String articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }
}
