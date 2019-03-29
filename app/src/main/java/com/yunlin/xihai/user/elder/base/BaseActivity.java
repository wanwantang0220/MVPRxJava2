package com.yunlin.xihai.user.elder.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yunlin.xihai.user.elder.app.App;

import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.yunlin.xihai.user.elder.app.AppConstants.TYPE_TOAST_ERROR;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected App application;

    public Context mContext;
    protected P presenter;
    protected Unbinder unbinder;

    protected abstract P createPresenter(Context mContext);

    protected abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        application = (App) getApplication();
        application.addActivity(this);

        setContentView(getLayoutId());
        presenter = createPresenter(mContext);
        unbinder = ButterKnife.bind(this);

        initView();
        initData();
    }

    protected abstract void initView();
    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
        if (unbinder != null) {
            unbinder.unbind();
        }
    }


    @Override
    public void onErrorCode(BaseModel model) {

    }


    public void showToast(String msg, int type) {
        application.showToast(msg, type);
    }

    public void showToast(int resId, int type) {
        application.showToast(resId, type);
    }

    public void showToast(String msg) {
        application.showToast(msg, TYPE_TOAST_ERROR);
    }

    public void showToast(int resId) {
        application.showToast(getString(resId), TYPE_TOAST_ERROR);
    }

}
