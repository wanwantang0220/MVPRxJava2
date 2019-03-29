package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.AlipayInfo;

public class AlipayResponse extends BaseResponse {

    private static final long serialVersionUID = 4628701667344399604L;
    private AlipayInfo results;

    public AlipayInfo getResults() {
        return results;
    }

    public void setResults(AlipayInfo results) {
        this.results = results;
    }
}
