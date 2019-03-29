package com.yunlin.xihai.user.elder.bean;

import java.io.Serializable;

public class VersionInfo implements Serializable {

    private static final long serialVersionUID = 1138284967803921550L;
    // 是否强制更新
    private boolean compel;
    // 更新内容
    private String description;
    // 是否有更新
    private boolean update;
    // 下载地址
    private String url;
    // 当前版本号
    private String version;

    public boolean isCompel() {
        return compel;
    }

    public void setCompel(boolean compel) {
        this.compel = compel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
