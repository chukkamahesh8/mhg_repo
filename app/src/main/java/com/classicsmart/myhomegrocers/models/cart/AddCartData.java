package com.classicsmart.myhomegrocers.models.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddCartData implements Serializable {
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("totalItemsCart")
    @Expose
    private Long totalItemsCart;
    @SerializedName("totalItemsCartAmount")
    @Expose
    private String totalItemsCartAmount;
    private final static long serialVersionUID = -7058507015906658329L;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Long getTotalItemsCart() {
        return totalItemsCart;
    }

    public void setTotalItemsCart(Long totalItemsCart) {
        this.totalItemsCart = totalItemsCart;
    }

    public String getTotalItemsCartAmount() {
        return totalItemsCartAmount;
    }

    public void setTotalItemsCartAmount(String totalItemsCartAmount) {
        this.totalItemsCartAmount = totalItemsCartAmount;
    }

}
