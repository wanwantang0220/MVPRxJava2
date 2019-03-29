package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ServiceListInfo;

public class ServiceListResponse extends BaseResponse {

    private static final long serialVersionUID = -6663111750808675290L;
    private ServiceListInfo results;

    public ServiceListInfo getResults() {
        return results;
    }

    public void setResults(ServiceListInfo results) {
        this.results = results;
    }
}
