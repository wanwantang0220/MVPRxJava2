package com.yunlin.xihai.user.elder.base;

public interface BaseView {


    /**
     * 错误码
     */
    void onErrorCode(BaseModel baseModel);

    /**
     * 显示错误信息
     *
     * @param msg
     */
    void onFault(String msg);

}
