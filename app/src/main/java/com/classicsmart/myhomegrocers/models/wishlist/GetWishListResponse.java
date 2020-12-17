package com.classicsmart.myhomegrocers.models.wishlist;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetWishListResponse implements Serializable {
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private List<WishListData> data = null;
    private final static long serialVersionUID = -4369048252305703014L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<WishListData> getData() {
        return data;
    }

    public void setData(List<WishListData> data) {
        this.data = data;
    }
}
