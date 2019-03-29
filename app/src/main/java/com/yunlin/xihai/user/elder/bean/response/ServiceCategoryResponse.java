package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ServiceCategoryInfo;

import java.util.ArrayList;

public class ServiceCategoryResponse extends BaseResponse {

    private static final long serialVersionUID = -3579132308667878180L;
    private ArrayList<ServiceCategoryInfo> results;

    public ArrayList<ServiceCategoryInfo> getResults() {
        return results;
    }

    public void setResults(ArrayList<ServiceCategoryInfo> results) {
        this.results = results;
    }
}
