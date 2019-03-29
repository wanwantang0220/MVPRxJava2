package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.HouseInfo;

import java.util.ArrayList;

public class MyHouseResponse extends BaseResponse {

    private static final long serialVersionUID = -5200199879211620117L;
    private ArrayList<HouseInfo> results;

    public ArrayList<HouseInfo> getResults() {
        return results;
    }

    public void setResults(ArrayList<HouseInfo> results) {
        this.results = results;
    }
}