package com.yunlin.xihai.user.elder.mvp.ui;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.bean.ResidentInfo;
import com.yunlin.xihai.user.elder.mvp.contract.MeView;
import com.yunlin.xihai.user.elder.mvp.presenter.MePresenter;
import com.yunlin.xihai.user.elder.view.LoadingLayout;

import butterknife.BindView;

public class MeActivity extends BaseActivity<MePresenter> implements MeView {
    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.ivHeadPic)
    ImageView ivHeadPic;
    @BindView(R.id.llUserHead)
    LinearLayout llUserHead;
    @BindView(R.id.tvUserName)
    TextView tvUserName;
    @BindView(R.id.ivModifyName)
    ImageView ivModifyName;
    @BindView(R.id.llModifyName)
    LinearLayout llModifyName;
    @BindView(R.id.tvSex)
    TextView tvSex;
    @BindView(R.id.llModifySex)
    LinearLayout llModifySex;
    @BindView(R.id.tvUserPhone)
    TextView tvUserPhone;
    @BindView(R.id.tvAddr)
    TextView tvAddr;
    @BindView(R.id.ivModifyAddr)
    ImageView ivModifyAddr;
    @BindView(R.id.llModifyAddr)
    LinearLayout llModifyAddr;
    @BindView(R.id.llModifyPassword)
    LinearLayout llModifyPassword;
    @BindView(R.id.llLogout)
    LinearLayout llLogout;
    @BindView(R.id.nsvMyInfo)
    NestedScrollView nsvMyInfo;
    @BindView(R.id.srMyInfo)
    SmartRefreshLayout srMyInfo;
    @BindView(R.id.llLoading)
    LoadingLayout llLoading;


    @Override
    protected MePresenter createPresenter(Context mContext) {
        return new MePresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_me;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        presenter.getUserInfo(true, MeActivity.this,llLoading);

    }

    @Override
    public void onShowResult(ResidentInfo info) {
        llLoading.showContent();
        finishRefresh();
    }

    @Override
    public void onShowError( String message) {
        llLoading.setErrorImage(R.mipmap.ic_system_fail);
        llLoading.setErrorText(message);
        llLoading.showError();
        finishRefresh();
    }


    private void finishRefresh() {
        srMyInfo.finishRefresh();
    }


    @Override
    public void onFault(String msg) {
        showToast(R.string.system_fail);

    }
}
