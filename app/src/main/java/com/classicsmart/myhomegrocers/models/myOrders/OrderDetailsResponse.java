package com.classicsmart.myhomegrocers.models.myOrders;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OrderDetailsResponse implements Serializable {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private OrderDetailsData data;
    private final static long serialVersionUID = -4207119399943204068L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public OrderDetailsData getData() {
        return data;
    }

    public void setData(OrderDetailsData data) {
        this.data = data;
    }
}
