package com.yunlin.xihai.user.elder.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yunlin.xihai.user.elder.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ServiceListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.ivPic)
    public ImageView ivPic;
    @BindView(R.id.tvTitle)
    public TextView tvTitle;
    @BindView(R.id.tvDesc)
    public TextView tvDesc;
    @BindView(R.id.tvPrice)
    public TextView tvPrice;
    @BindView(R.id.tvUnit)
    public TextView tvUnit;
    @BindView(R.id.tvFree)
    public TextView tvFree;

    public ServiceListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

//        ivPic = (ImageView) itemView.findViewById(R.id.ivPic);
//        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
//        tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);
//        tvPrice = (TextView) itemView.findViewById(R.id.tvPrice);
//        tvUnit = (TextView) itemView.findViewById(R.id.tvUnit);
//        tvFree = (TextView) itemView.findViewById(R.id.tvFree);
    }

}