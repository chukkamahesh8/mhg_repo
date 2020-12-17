package com.classicsmart.myhomegrocers.models.cart;

import java.io.Serializable;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteCartResponse implements Serializable
{

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private DeleteCartData data;
    private final static long serialVersionUID = -4207119399943204068L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public DeleteCartData getData() {
        return data;
    }

    public void setData(DeleteCartData data) {
        this.data = data;
    }

}
