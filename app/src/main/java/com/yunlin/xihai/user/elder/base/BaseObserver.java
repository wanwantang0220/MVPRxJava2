package com.yunlin.xihai.user.elder.base;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonParseException;
import com.orhanobut.logger.Logger;
import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.app.App;
import com.yunlin.xihai.user.elder.bean.response.BaseResponse;
import com.yunlin.xihai.user.elder.http.OnApiCancelListener;
import com.yunlin.xihai.user.elder.http.OnApiListener;
import com.yunlin.xihai.user.elder.util.CompressUtils;
import com.yunlin.xihai.user.elder.view.LoadingLayout;
import com.yunlin.xihai.user.elder.view.MyProgressDialog;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.observers.DisposableObserver;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

import static com.yunlin.xihai.user.elder.app.AppConstants.CODE_EXPIRE;
import static com.yunlin.xihai.user.elder.app.AppConstants.CODE_SUCCESS;

public class BaseObserver<T> extends DisposableObserver<ResponseBody> implements OnApiCancelListener {

    protected BaseView view;

    private boolean isShowDialog = false;
    private BaseActivity mActivity;
    private Class mClazz;
    private OnApiListener mOnApiListener;
    private MyProgressDialog progressDialog;
    private LoadingLayout mLoadingLayout;


    public BaseObserver(BaseView view) {
        this.view = view;
    }

    public BaseObserver(BaseView view, boolean isShowDialog) {
        this.view = view;
        this.isShowDialog = isShowDialog;
    }

    public BaseObserver(OnApiListener listener, BaseView view, boolean isShowDialog,
                        BaseActivity activity, Class mclazz) {
        this.mOnApiListener = listener;
        this.view = view;
        this.isShowDialog = isShowDialog;
        this.mActivity = activity;
        this.mClazz = mclazz;
        progressDialog = new MyProgressDialog(mActivity, R.style.DialogStyle);
        progressDialog.setOwnerActivity(mActivity);
        progressDialog.setMessage("loading");
    }

    public BaseObserver(OnApiListener listener, BaseView view,
                        BaseActivity activity, Class mclazz,
                        LoadingLayout loadingLayout) {
        this.mOnApiListener = listener;
        this.view = view;
        this.mActivity = activity;
        this.mClazz = mclazz;
        this.mLoadingLayout = loadingLayout;
        progressDialog = new MyProgressDialog(mActivity, R.style.DialogStyle);
        progressDialog.setOwnerActivity(mActivity);
        progressDialog.setMessage("loading");
    }


    @Override
    protected void onStart() {
        if (isShowDialog) {
            showDialog();
        }

    }

    @Override
    public void onNext(ResponseBody body) {

//        ResponseBody body = (ResponseBody) o;

        try {
            String parsed = CompressUtils.decompress(body.byteStream());
            Log.i("response = ", parsed);
            BaseResponse baseResponse = JSON.parseObject(parsed, BaseResponse.class);
            int code = baseResponse.getCode();
            if (CODE_EXPIRE == code) {
                gotoLogin(mActivity);
            } else {
                mOnApiListener.onSuccess(JSON.parseObject(parsed, mClazz));
            }
            if (isShowDialog) {
                hideDialog();
                progressDialog = null;
            }
        } catch (Exception e) {
            Logger.e(e.toString());

            if (isShowDialog) {
                hideDialog();
                progressDialog = null;
            }
            if (mLoadingLayout != null) {
                mLoadingLayout.setErrorText(mActivity.getString(R.string.net_error));
                mLoadingLayout.setErrorImage(R.mipmap.ic_net_error);
                mLoadingLayout.showError();
            }
            mOnApiListener.onFault(e.getMessage());
            mActivity.showToast(R.string.system_fail);
        }


    }

    @Override
    public void onError(Throwable e) {
        if (isShowDialog) {
            hideDialog();
            progressDialog = null;
        }
        if (mLoadingLayout != null) {
            mLoadingLayout.setErrorText(mActivity.getString(R.string.net_error));
            mLoadingLayout.setErrorImage(R.mipmap.ic_net_error);
            mLoadingLayout.showError();
        }
        BaseException be = null;

        if (e != null) {

            if (e instanceof BaseException) {
                be = (BaseException) e;

                //回调到view层 处理 或者根据项目情况处理
                if (view != null) {
                    view.onErrorCode(new BaseModel(be.getErrorCode(), be.getErrorMsg()));
                } else {
                    mOnApiListener.onFault(be.getErrorMsg());
                }

            } else {
                if (e instanceof HttpException) {
                    //   HTTP错误
                    be = new BaseException(BaseException.BAD_NETWORK_MSG, e, BaseException.BAD_NETWORK);
                } else if (e instanceof ConnectException
                        || e instanceof UnknownHostException) {
                    //   连接错误
                    be = new BaseException(BaseException.CONNECT_ERROR_MSG, e, BaseException.CONNECT_ERROR);
                } else if (e instanceof InterruptedIOException) {
                    //  连接超时
                    be = new BaseException(BaseException.CONNECT_TIMEOUT_MSG, e, BaseException.CONNECT_TIMEOUT);
                } else if (e instanceof JsonParseException
                        || e instanceof JSONException
                        || e instanceof ParseException) {
                    //  解析错误
                    be = new BaseException(BaseException.PARSE_ERROR_MSG, e, BaseException.PARSE_ERROR);
                } else {
                    be = new BaseException(BaseException.OTHER_MSG, e, BaseException.OTHER);
                }
            }
        } else {
            be = new BaseException(BaseException.OTHER_MSG, e, BaseException.OTHER);
        }

        mOnApiListener.onFault(be.getErrorMsg());
    }

    @Override
    public void onComplete() {
        Log.i("onComplete thread : ", "" + Thread.currentThread());
        hideDialog();
        progressDialog = null;

    }


    private static void gotoLogin(BaseActivity activity) {
        activity.showToast(R.string.relogin);
        ((App) activity.getApplication()).gotoLogin(activity);
    }

    private static void showUpdate(BaseActivity activity) {
        activity.showToast(R.string.update);
        ((App) activity.getApplication()).gotoWelcome(activity);
    }


    private void showDialog() {
        Activity activity = progressDialog.getOwnerActivity();

        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }

        if (progressDialog != null) {
            try {
                progressDialog.show();
                progressDialog.setCanceledOnTouchOutside(false);
            } catch (Exception e) {
            }
        }
    }

    private void hideDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            try {
                progressDialog.dismiss();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void onCancelProgress() {
        if (!this.isDisposed()) {
            this.dispose();
        }
    }
}
