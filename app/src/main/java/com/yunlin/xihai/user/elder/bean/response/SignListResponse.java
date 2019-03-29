package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.SignListInfo;

public class SignListResponse extends BaseResponse {

    private static final long serialVersionUID = 4357541920778533581L;
    private SignListInfo results;

    public SignListInfo getResults() {
        return results;
    }

    public void setResults(SignListInfo results) {
        this.results = results;
    }
}
