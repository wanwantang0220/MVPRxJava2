package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.AddressInfo;

import java.util.ArrayList;

public class ServiceAddrListResponse extends BaseResponse {

    private static final long serialVersionUID = -6128758064679585936L;
    private ArrayList<AddressInfo> results;

    public ArrayList<AddressInfo> getResults() {
        return results;
    }

    public void setResults(ArrayList<AddressInfo> results) {
        this.results = results;
    }
}
