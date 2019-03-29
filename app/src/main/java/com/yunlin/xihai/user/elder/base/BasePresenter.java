package com.yunlin.xihai.user.elder.base;

import com.yunlin.xihai.user.elder.http.ApiEngine;
import com.yunlin.xihai.user.elder.http.ApiServer;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class BasePresenter<V extends BaseView> {

    //请求失败重连次
    private int RETRY_COUNT = 1;
    public CompositeDisposable compositeDisposable;
    public V baseView;

    protected ApiServer apiServer = ApiEngine.getInstance().getApiService();


    public BasePresenter(V baseView) {
        this.baseView = baseView;
    }

    /**
     * 解除绑定
     */
    public void detachView() {
        baseView = null;
        removeDisposable();
    }

    /**
     * 返回 view
     *
     * @return
     */
    public V getBaseView() {
        return baseView;
    }


    public void addDisposable(Observable<?> observable, BaseObserver observer) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                //请求失败重连次数
                .retry(RETRY_COUNT)
                .subscribeWith(observer));


    }

    public void removeDisposable() {
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

}
