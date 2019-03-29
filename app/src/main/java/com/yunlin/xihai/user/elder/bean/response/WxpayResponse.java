package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.WxpayInfo;

public class WxpayResponse extends BaseResponse {

    private static final long serialVersionUID = 4150258922910253311L;
    private WxpayInfo results;

    public WxpayInfo getResults() {
        return results;
    }

    public void setResults(WxpayInfo results) {
        this.results = results;
    }
}
