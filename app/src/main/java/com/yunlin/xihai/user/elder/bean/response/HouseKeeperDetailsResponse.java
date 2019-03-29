package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.EmployeeInfo;

public class HouseKeeperDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = -3567349468242500925L;
    private EmployeeInfo results;

    public EmployeeInfo getResults() {
        return results;
    }

    public void setResults(EmployeeInfo results) {
        this.results = results;
    }


}