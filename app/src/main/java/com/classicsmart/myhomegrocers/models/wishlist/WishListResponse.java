package com.classicsmart.myhomegrocers.models.wishlist;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WishListResponse implements Serializable {
    @SerializedName("status")
    @Expose
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
