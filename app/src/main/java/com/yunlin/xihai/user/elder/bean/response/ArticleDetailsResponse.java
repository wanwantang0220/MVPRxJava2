package com.yunlin.xihai.user.elder.bean.response;


import com.yunlin.xihai.user.elder.bean.ArticleInfo;

public class ArticleDetailsResponse extends BaseResponse {

    private static final long serialVersionUID = -1917923273117230648L;
    private ArticleInfo results;

    public ArticleInfo getResults() {
        return results;
    }

    public void setResults(ArticleInfo results) {
        this.results = results;
    }
}
