package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ServiceAreaInfo;

import java.util.ArrayList;

public class ServiceAreaListResponse extends BaseResponse {

    private static final long serialVersionUID = -8487124515830420685L;
    private ArrayList<ServiceAreaInfo> results;

    public ArrayList<ServiceAreaInfo> getResults() {
        return results;
    }

    public void setResults(ArrayList<ServiceAreaInfo> results) {
        this.results = results;
    }
}
