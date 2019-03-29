package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.OrderInfo;

public class OrderDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = 6870179428429559393L;
    private OrderInfo results;

    public OrderInfo getResults() {
        return results;
    }

    public void setResults(OrderInfo results) {
        this.results = results;
    }
}
