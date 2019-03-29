package com.yunlin.xihai.user.elder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.mvp.contract.MainView;
import com.yunlin.xihai.user.elder.mvp.presenter.MainPresenter;
import com.yunlin.xihai.user.elder.mvp.ui.LoginActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {
    @BindView(R.id.btnMvp)
    Button btnMvp;

    @Override
    protected MainPresenter createPresenter(Context mContext) {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
//        btnMvp = findViewById(R.id.btnMvp);
//        btnMvp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, LoginActivity.class));
//            }
//        });
    }

    @OnClick({R.id.btnMvp})
    protected void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMvp:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void onResult() {

    }


    @Override
    public void onFault(String msg) {

    }
}
