package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.address.Address;
import com.classicsmart.myhomegrocers.models.myOrders.MyOrdersData;
import com.classicsmart.myhomegrocers.models.myOrders.Order;

import java.util.List;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.MyViewHolder> {
    private List<Order> deliveryAddressPojoList;
    private RadioButton lastCheckedRB;
    private Context mContext;

    public MyOrdersAdapter(Context context, List<Order> deliveryAddressPojoList) {
        this.deliveryAddressPojoList = deliveryAddressPojoList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_myorders, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Order deliveryAddressPojo = deliveryAddressPojoList.get(position);
        holder.orderId.setText("OrderId: #" + deliveryAddressPojo.getOrderId());
        holder.orderStatus.setText(deliveryAddressPojo.getStatus());
        holder.totalPrice.setText("Order total: $" + deliveryAddressPojo.getTotal());
        holder.deliveryDate.setText("Delivery Dtae: " + deliveryAddressPojo.getTentativeDeliveryDate());
        if (deliveryAddressPojo.getStatus().equalsIgnoreCase("Canceled")) {
            Glide.with(mContext).load(R.drawable.ic_on_its_way).into(holder.imStatus);

        } else if (deliveryAddressPojo.getStatus().equalsIgnoreCase("Pending")) {
            Glide.with(mContext).load(R.drawable.ic_on_its_way).into(holder.imStatus);

        } else if (deliveryAddressPojo.getStatus().equalsIgnoreCase("Delivered")) {
            Glide.with(mContext).load(R.drawable.ic_delivered).into(holder.imStatus);

        }

    }

    @Override
    public int getItemCount() {
        return deliveryAddressPojoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView orderId, orderStatus, totalPrice, deliveryDate, btnReOrder, btnRateOrder;
        public ImageView imStatus;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            orderId = itemView.findViewById(R.id.txt_orderid);
            orderStatus = itemView.findViewById(R.id.txt_order_status);
            totalPrice = itemView.findViewById(R.id.txt_total_price);
            deliveryDate = itemView.findViewById(R.id.txt_date_of_delivery);
            btnRateOrder = itemView.findViewById(R.id.txt_rate_order);
            btnReOrder = itemView.findViewById(R.id.txt_reorder);
            imStatus = itemView.findViewById(R.id.im_order_status);
        }
    }
}
