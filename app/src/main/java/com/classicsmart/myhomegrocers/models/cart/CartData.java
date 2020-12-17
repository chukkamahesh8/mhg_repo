package com.classicsmart.myhomegrocers.models.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CartData implements Serializable {
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("vouchers")
    @Expose
    private List<Vouchers> vouchers = null;
    @SerializedName("totals")
    @Expose
    private List<Total> totals = null;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("total_raw")
    @Expose
    private TotalRaw totalRaw;
    @SerializedName("total_product_count")
    @Expose
    private Long totalProductCount;
    @SerializedName("has_shipping")
    @Expose
    private Long hasShipping;
    @SerializedName("has_download")
    @Expose
    private Long hasDownload;
    @SerializedName("has_recurring_products")
    @Expose
    private Long hasRecurringProducts;
    @SerializedName("currency")
    @Expose
    private CurrencyData currency;
    private final static long serialVersionUID = -1089686782677774706L;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Vouchers> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Vouchers> vouchers) {
        this.vouchers = vouchers;
    }

    public List<Total> getTotals() {
        return totals;
    }

    public void setTotals(List<Total> totals) {
        this.totals = totals;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public TotalRaw getTotalRaw() {
        return totalRaw;
    }

    public void setTotalRaw(TotalRaw totalRaw) {
        this.totalRaw = totalRaw;
    }

    public Long getTotalProductCount() {
        return totalProductCount;
    }

    public void setTotalProductCount(Long totalProductCount) {
        this.totalProductCount = totalProductCount;
    }

    public Long getHasShipping() {
        return hasShipping;
    }

    public void setHasShipping(Long hasShipping) {
        this.hasShipping = hasShipping;
    }

    public Long getHasDownload() {
        return hasDownload;
    }

    public void setHasDownload(Long hasDownload) {
        this.hasDownload = hasDownload;
    }

    public Long getHasRecurringProducts() {
        return hasRecurringProducts;
    }

    public void setHasRecurringProducts(Long hasRecurringProducts) {
        this.hasRecurringProducts = hasRecurringProducts;
    }

    public CurrencyData getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyData currency) {
        this.currency = currency;
    }

}
