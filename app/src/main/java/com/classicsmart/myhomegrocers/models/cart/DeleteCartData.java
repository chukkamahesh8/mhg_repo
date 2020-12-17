package com.classicsmart.myhomegrocers.models.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DeleteCartData implements Serializable
{

    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("total_product_count")
    @Expose
    private Long totalProductCount;
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    private final static long serialVersionUID = -5677940676065790536L;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Long getTotalProductCount() {
        return totalProductCount;
    }

    public void setTotalProductCount(Long totalProductCount) {
        this.totalProductCount = totalProductCount;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
