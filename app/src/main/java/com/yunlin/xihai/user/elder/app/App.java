package com.yunlin.xihai.user.elder.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.yunlin.xihai.user.elder.WelcomeActivity;
import com.yunlin.xihai.user.elder.mvp.ui.LoginActivity;
import com.yunlin.xihai.user.elder.util.SharedPreferencesUitl;

import java.util.concurrent.CopyOnWriteArrayList;

import es.dmoral.toasty.Toasty;

import static com.yunlin.xihai.user.elder.app.AppConstants.EMPTY_STRING;
import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_ERROR;
import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_INFO;
import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_NORMAL;
import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_SUCCESS;
import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_WARNING;

public class App extends Application {

    public static Context appContext;
    private static App mContext;
    public static CopyOnWriteArrayList<Activity> activityList = new CopyOnWriteArrayList<Activity>();
    private static Toast mToast;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
        mContext = this;
    }

    public static App getContext() {
        return mContext;
    }



    public void addActivity(Activity activity) {
        if (!activityList.contains(activity)) {
            activityList.add(activity);
        }
    }

    public void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public void clearActivity() {
        for (Activity activity : activityList) {
            activity.finish();
        }
        activityList.clear();
    }

    public void showToast(int resId, int type) {
        showToast(getString(resId), type);
    }

    public void showToast(String msg) {
        showToast(msg, TYPE_TOAST_ERROR);
    }

    public void showToast(int resId) {
        showToast(getString(resId), TYPE_TOAST_ERROR);
    }

    public void cancelToast() {
        if (mToast != null) {
            mToast.cancel();
            mToast = null;
        }
    }

    public void showToast(String msg, int type) {
        cancelToast();
        switch (type) {
            case TYPE_TOAST_ERROR:
                mToast = Toasty.error(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.error(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
            case TYPE_TOAST_SUCCESS:
                mToast = Toasty.success(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.success(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
            case TYPE_TOAST_INFO:
                mToast = Toasty.info(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.info(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
            case TYPE_TOAST_WARNING:
                mToast = Toasty.warning(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.warning(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
            case TYPE_TOAST_NORMAL:
                mToast = Toasty.normal(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.normal(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
            default:
                mToast = Toasty.normal(getApplicationContext(), EMPTY_STRING, Toast.LENGTH_SHORT);
                mToast = Toasty.normal(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                break;
        }

        mToast.show();
    }


    public void gotoLogin(Activity activity) {
        SharedPreferencesUitl.cleanValue(activity);

        clearActivity();
        Intent intent = new Intent(activity, LoginActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    public void gotoWelcome(Activity activity) {
        SharedPreferencesUitl.cleanValue(activity);

        clearActivity();
        Intent intent = new Intent(activity, WelcomeActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
