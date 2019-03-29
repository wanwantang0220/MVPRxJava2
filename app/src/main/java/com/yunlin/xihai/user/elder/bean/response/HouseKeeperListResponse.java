package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.HouseKeeperListInfo;

public class HouseKeeperListResponse extends BaseResponse {

    private static final long serialVersionUID = 6261959715320894734L;
    private HouseKeeperListInfo results;

    public HouseKeeperListInfo getResults() {
        return results;
    }

    public void setResults(HouseKeeperListInfo results) {
        this.results = results;
    }


}