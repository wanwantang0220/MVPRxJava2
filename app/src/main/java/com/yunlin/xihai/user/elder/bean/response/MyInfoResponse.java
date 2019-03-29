package com.yunlin.xihai.user.elder.bean.response;


import com.google.gson.annotations.SerializedName;
import com.yunlin.xihai.user.elder.bean.ResidentInfo;

public class MyInfoResponse extends BaseResponse {

    private static final long serialVersionUID = 4633511369493972648L;
    @SerializedName("results")
    private ResidentInfo results;

    public ResidentInfo getResults() {
        return results;
    }

    public void setResults(ResidentInfo results) {
        this.results = results;
    }

}