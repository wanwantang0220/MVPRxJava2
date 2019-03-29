package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.CommunityInfo;

import java.util.ArrayList;

public class CommunityListResponse extends BaseResponse {

    private static final long serialVersionUID = 7772403695006917453L;
    private ArrayList<CommunityInfo> results;

    public ArrayList<CommunityInfo> getResults() {
        return results;
    }

    public void setResults(ArrayList<CommunityInfo> results) {
        this.results = results;
    }
}
