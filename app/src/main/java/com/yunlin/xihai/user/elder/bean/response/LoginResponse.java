package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.UserInfo;

public class LoginResponse extends BaseResponse {

    private static final long serialVersionUID = 989143191884016734L;
    private UserInfo results;

    public UserInfo getResults() {
        return results;
    }

    public void setResults(UserInfo results) {
        this.results = results;
    }


}