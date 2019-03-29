package com.yunlin.xihai.user.elder.mvp.presenter;

import android.util.Log;

import com.yunlin.xihai.user.elder.base.BaseObserver;
import com.yunlin.xihai.user.elder.base.BasePresenter;
import com.yunlin.xihai.user.elder.bean.response.MyInfoResponse;
import com.yunlin.xihai.user.elder.http.OnApiListener;
import com.yunlin.xihai.user.elder.http.request.XLHttpCommonRequest;
import com.yunlin.xihai.user.elder.mvp.contract.MeView;
import com.yunlin.xihai.user.elder.mvp.ui.MeActivity;
import com.yunlin.xihai.user.elder.view.LoadingLayout;

import retrofit2.http.Query;

import static com.yunlin.xihai.user.elder.app.AppConstants.CODE_SUCCESS;

public class MePresenter extends BasePresenter<MeView> {

    public MePresenter(MeView baseView) {
        super(baseView);
    }

    public void getUserInfo(Boolean isShow, MeActivity activity, LoadingLayout loadingLayout) {

        XLHttpCommonRequest req = new XLHttpCommonRequest();


        addDisposable(apiServer.getUserInfoReq(req.toRequestBody()), new BaseObserver(new OnApiListener<MyInfoResponse>() {
            @Override
            public void onSuccess(MyInfoResponse response) {
                Log.i("res", response.getResults().getName());
                int code = response.getCode();
                String message = response.getMsg();
                if (CODE_SUCCESS == code) {
                    baseView.onShowResult(response.getResults());
                } else {
                    baseView.onShowError(message);
                }

            }

            @Override
            public void onFault(String errorMsg) {
                baseView.onFault(errorMsg);

            }
        }, baseView, activity, MyInfoResponse.class, loadingLayout));


    }
}
