package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReorderProductPayLoad implements Serializable
{

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("order_product_id")
    @Expose
    private String orderProductId;
    private final static long serialVersionUID = -6798986304097373995L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(String orderProductId) {
        this.orderProductId = orderProductId;
    }

}