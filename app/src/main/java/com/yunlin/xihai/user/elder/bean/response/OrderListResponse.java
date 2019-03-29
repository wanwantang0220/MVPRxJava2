package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.OrderListInfo;

public class OrderListResponse extends BaseResponse {

    private static final long serialVersionUID = 3150807648803492662L;
    private OrderListInfo results;

    public OrderListInfo getResults() {
        return results;
    }

    public void setResults(OrderListInfo results) {
        this.results = results;
    }
}
