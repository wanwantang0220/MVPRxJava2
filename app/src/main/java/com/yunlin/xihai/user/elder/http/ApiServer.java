package com.yunlin.xihai.user.elder.http;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiServer {


    String BASE_URL = "http://appapi.yunlinyanglao.com/app/";

    @POST("login")
    Observable<ResponseBody> login(@Query("mobile") String mobile, @Query("password") String password);

    @POST("pension/server/list")
    Observable<ResponseBody> getServiceListReq(@Body RequestBody body);


    @POST("customer/info")
    Observable<ResponseBody> getUserInfoReq(@Body RequestBody body);
}
