package com.yunlin.xihai.user.elder.mvp.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.mvp.contract.LoginView;
import com.yunlin.xihai.user.elder.mvp.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginView {


    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnService)
    Button btnService;
    @BindView(R.id.btnMe)
    Button btnMe;

    private String email = "18961722253";
    private String password = "123456";

    @Override
    protected LoginPresenter createPresenter(Context mContext) {
        return new LoginPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
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

    }


    @OnClick({R.id.btnLogin, R.id.btnService, R.id.btnMe})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                presenter.login(email, password, LoginActivity.this);
                break;
            case R.id.btnService:
                startActivity(new Intent(LoginActivity.this, ServiceListActivity.class));
                break;
            case R.id.btnMe:
                startActivity(new Intent(LoginActivity.this, MeActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void onLoginSucc() {

    }


    @Override
    public void onFault(String msg) {

    }
}
