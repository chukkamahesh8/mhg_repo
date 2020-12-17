package com.classicsmart.myhomegrocers.models.cart;

import java.io.Serializable;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateCartResponse implements Serializable
{

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private UpdateCartData data;
    private final static long serialVersionUID = 7131370091829002102L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UpdateCartData getData() {
        return data;
    }

    public void setData(UpdateCartData data) {
        this.data = data;
    }

}