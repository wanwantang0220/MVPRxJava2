package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.VersionInfo;

public class CheckVersionResponse extends BaseResponse {

    private static final long serialVersionUID = -4772518196512867620L;
    private VersionInfo results;

    public VersionInfo getResults() {
        return results;
    }

    public void setResults(VersionInfo results) {
        this.results = results;
    }


}