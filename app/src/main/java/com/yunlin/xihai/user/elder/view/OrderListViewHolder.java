package com.yunlin.xihai.user.elder.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.yunlin.xihai.user.elder.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tvOrderTime)
    public TextView tvOrderTime;
    @BindView(R.id.tvOrderStatus)
    public TextView tvOrderStatus;
    @BindView(R.id.ivPic)
    public ImageView ivPic;
    @BindView(R.id.tvTitle)
    public TextView tvTitle;
    @BindView(R.id.tvOrderType)
    public TextView tvOrderType;
    @BindView(R.id.tvServiceTime)
    public TextView tvServiceTime;
    @BindView(R.id.tvOrderPriceLabel)
    public TextView tvOrderPriceLabel;
    @BindView(R.id.tvOrderPrice)
    public TextView tvOrderPrice;

    public OrderListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

//        tvOrderTime = (TextView) itemView.findViewById(R.id.tvOrderTime);
//        tvOrderStatus = (TextView) itemView.findViewById(R.id.tvOrderStatus);
//        ivPic = (ImageView) itemView.findViewById(R.id.ivPic);
//        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
//        tvOrderType = (TextView) itemView.findViewById(R.id.tvOrderType);
//        tvServiceTime = (TextView) itemView.findViewById(R.id.tvServiceTime);
//        tvOrderPriceLabel = (TextView) itemView.findViewById(R.id.tvOrderPriceLabel);
//        tvOrderPrice = (TextView) itemView.findViewById(R.id.tvOrderPrice);
    }

}