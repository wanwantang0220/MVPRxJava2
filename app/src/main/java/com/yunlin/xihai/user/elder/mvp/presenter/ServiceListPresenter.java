package com.yunlin.xihai.user.elder.mvp.presenter;

import com.yunlin.xihai.user.elder.base.BaseObserver;
import com.yunlin.xihai.user.elder.base.BasePresenter;
import com.yunlin.xihai.user.elder.bean.ServiceListInfo;
import com.yunlin.xihai.user.elder.bean.response.ServiceListResponse;
import com.yunlin.xihai.user.elder.http.OnApiListener;
import com.yunlin.xihai.user.elder.http.request.XLHttpCommonRequest;
import com.yunlin.xihai.user.elder.mvp.contract.ServiceListView;
import com.yunlin.xihai.user.elder.mvp.ui.ServiceListActivity;

import retrofit2.http.Query;

public class ServiceListPresenter extends BasePresenter<ServiceListView> {

    public ServiceListPresenter(ServiceListView baseView) {
        super(baseView);
    }

    public void getServiceListReq(String page, String limit, String serviceCategoryId, String serverAreaId,
                                  ServiceListActivity activity, boolean isShow) {

        XLHttpCommonRequest req = new XLHttpCommonRequest()
                .put("page", page)
                .put("limit", limit)
                .put("serverCategoryId", serviceCategoryId)
                .put("serverAreaId", serverAreaId);


        addDisposable(apiServer.getServiceListReq(req.toRequestBody()),
                new BaseObserver(new OnApiListener<ServiceListResponse>() {
                    @Override
                    public void onSuccess(ServiceListResponse response) {
                        ServiceListInfo info = response.getResults();
                        baseView.onResult(info);
                    }

                    @Override
                    public void onFault(String errorMsg) {
                        baseView.onFault(errorMsg);

                    }
                }, baseView, isShow, activity, ServiceListResponse.class));
    }
}
