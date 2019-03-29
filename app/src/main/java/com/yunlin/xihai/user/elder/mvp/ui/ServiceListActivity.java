package com.yunlin.xihai.user.elder.mvp.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.bean.ServiceListInfo;
import com.yunlin.xihai.user.elder.mvp.adapter.ServiceListAdapter;
import com.yunlin.xihai.user.elder.mvp.contract.ServiceListView;
import com.yunlin.xihai.user.elder.mvp.presenter.ServiceListPresenter;
import com.yunlin.xihai.user.elder.util.SharedPreferencesUitl;
import com.yunlin.xihai.user.elder.view.EmptyRecyclerView;
import com.yunlin.xihai.user.elder.view.MultiItemDivider;

import java.util.HashMap;

import butterknife.BindView;
import ezy.ui.layout.LoadingLayout;

import static com.yunlin.xihai.user.elder.app.AppConstants.COMMUNITY_CODE;
import static com.yunlin.xihai.user.elder.app.AppConstants.PAGE_SIZE;

public class ServiceListActivity extends BaseActivity<ServiceListPresenter> implements ServiceListView {

    private static final String TAG = ServiceListActivity.class.getName();
    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.rvService)
    EmptyRecyclerView rvService;
    @BindView(R.id.srService)
    SmartRefreshLayout srService;
    @BindView(R.id.llLoading)
    LoadingLayout llLoading;

    private MultiItemDivider divider;
    private ServiceListAdapter serviceAdapter;
    private LinearLayoutManager linearLayoutManager;

    private View emptyView;

    private String serviceCategoryId;
    private int pageNo = 1;


    @Override
    protected ServiceListPresenter createPresenter(Context mContext) {
        return new ServiceListPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_list_service;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        emptyView = LayoutInflater.from(this).inflate(R.layout.empty_view, null, false);

        Intent intent = getIntent();

        if (intent != null) {
            String title = intent.getStringExtra("title");
            tvTitle.setText(title);

            serviceCategoryId = intent.getStringExtra("serviceCategoryId");
        }

        serviceAdapter = new ServiceListAdapter(this, application);
        linearLayoutManager = new LinearLayoutManager(this);
        rvService.setLayoutManager(linearLayoutManager);

        //分割线
        divider = new MultiItemDivider(this, MultiItemDivider.VERTICAL_LIST, R.drawable.shape_divider);
        //最后一个item下没有分割线
        divider.setDividerMode(MultiItemDivider.INSIDE);
        //收进padding
        divider.clipToChildPadding(true);
        rvService.addItemDecoration(divider);
        rvService.setEmptyView(emptyView);
        rvService.setAdapter(serviceAdapter);

        getServiceList(true);

    }

    /**
     * 联网
     *
     * @param isShow
     */
    private void getServiceList(boolean isShow) {
        String page = "1";//String.valueOf(pageNo);
        String limit = String.valueOf(PAGE_SIZE);
        String serverCategoryId = "6"; //serverCategoryId
        String serverAreaId = "3";//SharedPreferencesUitl.getStringValue(this, COMMUNITY_CODE);

        presenter.getServiceListReq(page, limit, serviceCategoryId, serverAreaId, ServiceListActivity.this, isShow);
    }

    @Override
    protected void initData() {

//
//        srService.setOnRefreshListener(new OnRefreshListener() {
//            @Override
//            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
//                pageNo = 1;
//                getServiceList(false);
//            }
//        });
//
//        srService.setOnLoadMoreListener(new OnLoadMoreListener() {
//            @Override
//            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
//                getServiceList(false);
//            }
//        });
//
//        llLoading.setRetryListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                pageNo = 1;
//
//                llLoading.showLoading();
//                getServiceList(false);
//            }
//        });
    }

    @Override
    public void onResult(ServiceListInfo info) {

    }


    @Override
    public void onFault(String msg) {

    }
}
