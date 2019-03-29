package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ActivityInfo;

public class ActivityDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = 4245132977385797197L;
    private ActivityInfo results;

    public ActivityInfo getResults() {
        return results;
    }

    public void setResults(ActivityInfo results) {
        this.results = results;
    }
}
