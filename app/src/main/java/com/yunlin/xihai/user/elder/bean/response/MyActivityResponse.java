package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.MyActivityListInfo;

public class MyActivityResponse extends BaseResponse {

    private static final long serialVersionUID = -1653187962916871946L;
    private MyActivityListInfo results;

    public MyActivityListInfo getResults() {
        return results;
    }

    public void setResults(MyActivityListInfo results) {
        this.results = results;
    }
}
