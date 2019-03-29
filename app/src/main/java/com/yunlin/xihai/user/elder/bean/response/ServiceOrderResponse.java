package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.OrderInfo;

public class ServiceOrderResponse extends BaseResponse {

    private static final long serialVersionUID = 1058976311212560882L;
    private OrderInfo results;

    public OrderInfo getResults() {
        return results;
    }

    public void setResults(OrderInfo results) {
        this.results = results;
    }
}
