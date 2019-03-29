package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.MyActivityInfo;

public class MyActivityDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = 1676427999337766617L;
    private MyActivityInfo results;

    public MyActivityInfo getResults() {
        return results;
    }

    public void setResults(MyActivityInfo results) {
        this.results = results;
    }
}
