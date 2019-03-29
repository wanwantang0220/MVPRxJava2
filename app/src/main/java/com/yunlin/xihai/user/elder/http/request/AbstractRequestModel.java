package com.yunlin.xihai.user.elder.http.request;

import com.google.gson.Gson;

import okhttp3.RequestBody;

public class AbstractRequestModel extends BaseModel {

    public RequestBody toRequestBody() {
        String route = new Gson().toJson(this);
        return RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), route);
    }
}
