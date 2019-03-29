package com.yunlin.xihai.user.elder.mvp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.app.App;
import com.yunlin.xihai.user.elder.app.AppConstants;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.bean.ServiceInfo;
import com.yunlin.xihai.user.elder.module.GlideApp;
import com.yunlin.xihai.user.elder.util.AppUtil;
import com.yunlin.xihai.user.elder.view.ServiceListViewHolder;

import java.util.ArrayList;

public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListViewHolder> implements AppConstants {

    private App mApplication;
    private ArrayList<ServiceInfo> dataList = new ArrayList<>();
    private BaseActivity mContext;
    private LayoutInflater mInflater;

    public ServiceListAdapter(BaseActivity context, App application) {
        mApplication = application;
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<ServiceInfo> list, boolean isFirst) {
        if (isFirst) {
            dataList.clear();
        }

        if (list != null && list.size() > 0) {
            dataList.addAll(list);
            notifyDataSetChanged();
        } else {
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ServiceListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_service_list, parent, false);
        return new ServiceListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceListViewHolder viewHolder, final int position) {

        final ServiceInfo serviceInfo = dataList.get(position);

        if (!AppUtil.isDestroy(mContext)) {
            GlideApp.with(mContext).load(serviceInfo.getPhoto()).placeholder(R.color.gray).error(R.color.gray).dontAnimate().into(viewHolder.ivPic);
        }

        viewHolder.tvTitle.setText(serviceInfo.getServerName());
        viewHolder.tvDesc.setText(serviceInfo.getDescription());

        if (serviceInfo.getAppointment() == 1) {
            viewHolder.tvPrice.setText(String.format(mContext.getString(R.string.service_list_price_value), AppUtil.formatDoubleAuto(serviceInfo.getEarnestPrice())));
            viewHolder.tvUnit.setText(R.string.service_list_unit_earnest);
        } else {
            viewHolder.tvPrice.setText(String.format(mContext.getString(R.string.service_list_price_value), AppUtil.formatDoubleAuto(serviceInfo.getScalePrice())));
            viewHolder.tvUnit.setText(String.format(mContext.getString(R.string.service_list_unit_value), serviceInfo.getScaleUnit()));
        }

        if (serviceInfo.getScalePrice() > 0) {
            viewHolder.tvPrice.setVisibility(View.VISIBLE);
            viewHolder.tvUnit.setVisibility(View.VISIBLE);
            viewHolder.tvFree.setVisibility(View.GONE);
        } else {
            viewHolder.tvPrice.setVisibility(View.GONE);
            viewHolder.tvUnit.setVisibility(View.GONE);
            viewHolder.tvFree.setVisibility(View.VISIBLE);
        }

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (mApplication.isQuickClick()) {
//                    return;
//                }
//                Intent intent = new Intent(mContext, ServiceDetailsActivity.class);
//                intent.putExtra("serviceId", serviceInfo.getServerId());
//                intent.putExtra("servicePrice", serviceInfo.getScalePrice());
//                intent.putExtra(PARAM_URL, serviceInfo.getUrl());
//                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }
}
