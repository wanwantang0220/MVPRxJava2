package com.yunlin.xihai.user.elder.mvp.presenter;

import android.util.Log;

import com.yunlin.xihai.user.elder.base.BaseObserver;
import com.yunlin.xihai.user.elder.base.BasePresenter;
import com.yunlin.xihai.user.elder.bean.ServiceAreaInfo;
import com.yunlin.xihai.user.elder.bean.UserInfo;
import com.yunlin.xihai.user.elder.bean.response.LoginResponse;
import com.yunlin.xihai.user.elder.http.OnApiListener;
import com.yunlin.xihai.user.elder.mvp.contract.LoginView;
import com.yunlin.xihai.user.elder.mvp.ui.LoginActivity;
import com.yunlin.xihai.user.elder.util.SharedPreferencesUitl;

import static com.yunlin.xihai.user.elder.app.AppConstants.CITY_CODE;
import static com.yunlin.xihai.user.elder.app.AppConstants.CITY_NAME;
import static com.yunlin.xihai.user.elder.app.AppConstants.COMMUNITY_CODE;
import static com.yunlin.xihai.user.elder.app.AppConstants.COMMUNITY_NAME;
import static com.yunlin.xihai.user.elder.app.AppConstants.IDENTITY;
import static com.yunlin.xihai.user.elder.app.AppConstants.MOBILE;
import static com.yunlin.xihai.user.elder.app.AppConstants.TOKEN;
import static com.yunlin.xihai.user.elder.app.AppConstants.USER_ID;
import static com.yunlin.xihai.user.elder.app.AppConstants.USER_NAME;

public class LoginPresenter extends BasePresenter<LoginView> {

    public LoginPresenter(LoginView baseView) {
        super(baseView);
    }


    public void login(String email, String password, final LoginActivity mActivity) {


        addDisposable(apiServer.login(email,password),new BaseObserver(new OnApiListener<LoginResponse>(){

            @Override
            public void onSuccess(LoginResponse response) {
                Log.i("res", response.getResults().getMobile());
                UserInfo userInfo = response.getResults();
                saveUserInfo(userInfo,mActivity);
                baseView.onLoginSucc();
            }

            @Override
            public void onFault(String errorMsg) {
                baseView.onFault(errorMsg);
            }
        },baseView,true,mActivity,LoginResponse.class));
    }

    private void saveUserInfo(UserInfo userInfo ,LoginActivity mActivity) {

        ServiceAreaInfo serviceAreaInfo = userInfo.getServerArea();
        SharedPreferencesUitl.setStringValue(mActivity, CITY_NAME, serviceAreaInfo.getCityName());
        SharedPreferencesUitl.setStringValue(mActivity, CITY_CODE, serviceAreaInfo.getCityCode());
        SharedPreferencesUitl.setStringValue(mActivity, COMMUNITY_NAME, serviceAreaInfo.getName());
        SharedPreferencesUitl.setStringValue(mActivity, COMMUNITY_CODE, serviceAreaInfo.getId());

        SharedPreferencesUitl.setStringValue(mActivity, TOKEN, userInfo.getToken());
        SharedPreferencesUitl.setStringValue(mActivity, MOBILE, userInfo.getMobile());
        SharedPreferencesUitl.setStringValue(mActivity, USER_ID, userInfo.getUserId());
        SharedPreferencesUitl.setStringValue(mActivity, USER_NAME, userInfo.getUserName());
        SharedPreferencesUitl.setStringValue(mActivity, IDENTITY, userInfo.getIdentity());

    }
}
