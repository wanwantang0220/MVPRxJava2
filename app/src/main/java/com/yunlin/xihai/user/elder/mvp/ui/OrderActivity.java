package com.yunlin.xihai.user.elder.mvp.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.mvp.adapter.OrderListAdapter;
import com.yunlin.xihai.user.elder.mvp.contract.OrderView;
import com.yunlin.xihai.user.elder.mvp.presenter.OrderPresenter;
import com.yunlin.xihai.user.elder.view.EmptyRecyclerView;
import com.yunlin.xihai.user.elder.view.MyDividerItemDecoration;

import butterknife.BindView;
import ezy.ui.layout.LoadingLayout;

import static com.yunlin.xihai.user.elder.app.AppConstants.ORDER_SEARCH_TYPE_ALL;

public class OrderActivity extends BaseActivity<OrderPresenter> implements OrderView {

    @BindView(R.id.rvOrder)
    EmptyRecyclerView rvOrder;
    @BindView(R.id.srOrder)
    SmartRefreshLayout srOrder;
    @BindView(R.id.llLoading)
    LoadingLayout llLoading;

    private MyDividerItemDecoration divider;
    private OrderListAdapter orderAdapter;
    private LinearLayoutManager linearLayoutManager;

    private View emptyView;

    private String orderStatus = ORDER_SEARCH_TYPE_ALL;



    @Override
    protected OrderPresenter createPresenter(Context mContext) {
        return new OrderPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_order;
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

    @Override
    public void onResult() {

    }


    @Override
    public void onFault(String msg) {

    }
}
