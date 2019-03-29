package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ServiceInfo;

public class ServiceDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = -2334630237818773013L;
    private ServiceInfo results;

    public ServiceInfo getResults() {
        return results;
    }

    public void setResults(ServiceInfo results) {
        this.results = results;
    }
}
