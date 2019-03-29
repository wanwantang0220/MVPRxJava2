package com.yunlin.xihai.user.elder.mvp.contract;

import com.yunlin.xihai.user.elder.base.BaseView;
import com.yunlin.xihai.user.elder.bean.ServiceListInfo;

public interface ServiceListView extends BaseView {

    void onResult(ServiceListInfo info);
}
