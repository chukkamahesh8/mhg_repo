package com.classicsmart.myhomegrocers.models.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UpdateCartData implements Serializable {

    @SerializedName("total")
    @Expose
    private String total;
    private final static long serialVersionUID = -4200045745612030734L;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}