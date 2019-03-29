package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.HomeInfo;

public class HomeResponse extends BaseResponse {

    private static final long serialVersionUID = -2731903915890834273L;
    private HomeInfo results;

    public HomeInfo getResults() {
        return results;
    }

    public void setResults(HomeInfo results) {
        this.results = results;
    }
}
