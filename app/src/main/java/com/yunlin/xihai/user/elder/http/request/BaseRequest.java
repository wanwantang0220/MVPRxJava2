package com.yunlin.xihai.user.elder.http.request;

import com.google.gson.annotations.SerializedName;

public class BaseRequest extends BaseModel{
    @SerializedName("object")
    private BaseModel data;

    BaseRequest(BaseModel data) {
        this.data = data;
    }
}
