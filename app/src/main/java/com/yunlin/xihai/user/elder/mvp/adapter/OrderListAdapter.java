package com.yunlin.xihai.user.elder.mvp.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunlin.xihai.user.elder.R;
import com.yunlin.xihai.user.elder.app.App;
import com.yunlin.xihai.user.elder.app.AppConstants;
import com.yunlin.xihai.user.elder.base.BaseActivity;
import com.yunlin.xihai.user.elder.bean.OrderInfo;
import com.yunlin.xihai.user.elder.module.GlideApp;
import com.yunlin.xihai.user.elder.util.AppUtil;
import com.yunlin.xihai.user.elder.view.OrderListViewHolder;

import java.util.ArrayList;

public class OrderListAdapter extends RecyclerView.Adapter<OrderListViewHolder> implements AppConstants {

    private App mApplication;
    private ArrayList<OrderInfo> dataList = new ArrayList<>();
    private BaseActivity mContext;
    private Fragment mFragment;
    private LayoutInflater mInflater;

    public OrderListAdapter(BaseActivity context, App application, Fragment fragment) {
        mContext = context;
        mApplication = application;
        mFragment = fragment;
        mInflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<OrderInfo> list, boolean isFirst) {
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
    public OrderListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_order_list, parent, false);
        return new OrderListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderListViewHolder viewHolder, final int position) {

        final OrderInfo orderInfo = dataList.get(position);

        if (!AppUtil.isDestroy(mContext)) {
            GlideApp.with(mContext).load(orderInfo.getPhoto()).placeholder(R.color.gray).error(R.color.gray).dontAnimate().into(viewHolder.ivPic);
        }

        viewHolder.tvTitle.setText(orderInfo.getName());

        int orderType = orderInfo.getOrderType();
        if (orderType == ORDER_TYPE_EARNEST) {
            viewHolder.tvOrderTime.setText(orderInfo.getAssocOrderTime());

            int orderStatus = orderInfo.getOrderStatus();
            if (orderStatus == ORDER_EARNEST_STATE_UNPAID) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_unpaid);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_red));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_earnest_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getAssocPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_PAY || orderStatus == ORDER_EARNEST_STATE_DISTRIBUTION || orderStatus == ORDER_EARNEST_STATE_SIGN) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_sign);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_yellow));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_earnest_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getAssocPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_REFUND) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_refund);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_earnest_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getAssocPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_CANCEL) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_cancel);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_earnest_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getAssocPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_CONSULT_UNPAID) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_consult_unpaid);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_red));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_CONSULT_PAY) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_sign);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_yellow));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_EVALUATE) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_evaluate);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_yellow));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_COMPLETE) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_complete);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));

            } else if (orderStatus == ORDER_EARNEST_STATE_CONSULT_CANCEL) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_consult_cancel);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));

            } else {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_earnest_state_cancel);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));

                viewHolder.tvOrderPriceLabel.setText(R.string.order_list_earnest);
                viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getAssocPrice())));
            }

            viewHolder.tvOrderType.setText(R.string.order_list_earnest);
            viewHolder.tvOrderType.setTextColor(mContext.getColor(R.color.font_yellow));
            viewHolder.tvOrderType.setBackground(mContext.getDrawable(R.drawable.textview_yellow_bg));

        } else {
            viewHolder.tvOrderTime.setText(orderInfo.getOrderTime());

            int orderStatus = orderInfo.getOrderStatus();
            if (orderStatus == ORDER_STATE_UNPAID) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_unpaid);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_red));
            } else if (orderStatus == ORDER_STATE_PAY || orderStatus == ORDER_STATE_DISTRIBUTION || orderStatus == ORDER_STATE_SIGN) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_sign);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_yellow));
            } else if (orderStatus == ORDER_STATE_REFUND) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_refund);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));
            } else if (orderStatus == ORDER_STATE_EVALUATE) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_evaluate);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_yellow));
            } else if (orderStatus == ORDER_STATE_COMPLETE) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_complete);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));
            } else if (orderStatus == ORDER_STATE_CANCEL) {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_cancel);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));
            } else {
                viewHolder.tvOrderStatus.setText(R.string.order_list_order_state_cancel);
                viewHolder.tvOrderStatus.setTextColor(mContext.getColor(R.color.font_gray));
            }

            viewHolder.tvOrderType.setText(R.string.order_list_common);
            viewHolder.tvOrderType.setTextColor(mContext.getColor(R.color.font_red));
            viewHolder.tvOrderType.setBackground(mContext.getDrawable(R.drawable.textview_pink_bg));

            viewHolder.tvOrderPriceLabel.setText(R.string.order_list_common_price);
            viewHolder.tvOrderPrice.setText(String.format(mContext.getString(R.string.serve_pay_price_value), AppUtil.formatDoubleAuto(orderInfo.getRealPrice())));
        }

        viewHolder.tvServiceTime.setText(orderInfo.getOrderServerTime());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (mApplication.isQuickClick()) {
//                    return;
//                }
//                Intent intent = new Intent(mContext, OrderDetailsActivity.class);
//                intent.putExtra("title", orderInfo.getName());
//                intent.putExtra("orderId", orderInfo.getOrderId());
//                mFragment.startActivityForResult(intent, REQUEST_REFRESH);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }
}