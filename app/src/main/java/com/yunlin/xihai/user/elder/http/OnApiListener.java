package com.yunlin.xihai.user.elder.http;

public interface OnApiListener<T> {
    void onSuccess(T response);

    void onFault(String errorMsg);

}

