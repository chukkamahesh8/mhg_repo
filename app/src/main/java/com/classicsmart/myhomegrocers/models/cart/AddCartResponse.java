package com.classicsmart.myhomegrocers.models.cart;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddCartResponse  implements Serializable {


    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private AddCartData data;
    private final static long serialVersionUID = -7603899540880736836L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AddCartData getData() {
        return data;
    }

    public void setData(AddCartData data) {
        this.data = data;
    }
}
