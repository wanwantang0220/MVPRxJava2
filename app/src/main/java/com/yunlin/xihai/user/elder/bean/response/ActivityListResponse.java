package com.yunlin.xihai.user.elder.bean.response;

import com.yunlin.xihai.user.elder.bean.ActivityListInfo;

public class ActivityListResponse extends BaseResponse {

    private static final long serialVersionUID = 1503689699632867128L;
    private ActivityListInfo results;

    public ActivityListInfo getResults() {
        return results;
    }

    public void setResults(ActivityListInfo results) {
        this.results = results;
    }
}
