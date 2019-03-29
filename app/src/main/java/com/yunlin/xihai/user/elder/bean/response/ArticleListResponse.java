package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ArticleListInfo;

public class ArticleListResponse extends BaseResponse {

    private static final long serialVersionUID = 4103623597973207824L;
    private ArticleListInfo results;

    public ArticleListInfo getResults() {
        return results;
    }

    public void setResults(ArticleListInfo results) {
        this.results = results;
    }
}
