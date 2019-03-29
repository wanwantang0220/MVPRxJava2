package com.yunlin.xihai.user.elder.mvp.contract;

import com.yunlin.xihai.user.elder.base.BaseView;
import com.yunlin.xihai.user.elder.bean.ResidentInfo;

public interface MeView extends BaseView {

    void onShowResult(ResidentInfo info);

    void onShowError( String message);
}
