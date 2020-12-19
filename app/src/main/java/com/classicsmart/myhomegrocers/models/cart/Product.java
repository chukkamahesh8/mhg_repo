package com.classicsmart.myhomegrocers.models.cart;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable
{

    @SerializedName("cart_id")
    @Expose
    private String cartId;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("option")
    @Expose
    private List<Object> option = null;
    @SerializedName("recurring")
    @Expose
    private String recurring;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("stock")
    @Expose
    private Boolean stock;
    @SerializedName("reward")
    @Expose
    private String reward;
    @SerializedName("excluding_tax")
    @Expose
    private Boolean excludingTax;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("saving_total")
    @Expose
    private double savingTotal;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("wishlist")
    @Expose
    private Boolean wishlist;
    private final static long serialVersionUID = -3872295858507642905L;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Object> getOption() {
        return option;
    }

    public void setOption(List<Object> option) {
        this.option = option;
    }

    public String getRecurring() {
        return recurring;
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Boolean getExcludingTax() {
        return excludingTax;
    }

    public void setExcludingTax(Boolean excludingTax) {
        this.excludingTax = excludingTax;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getSavingTotal() {
        return savingTotal;
    }

    public void setSavingTotal(double savingTotal) {
        this.savingTotal = savingTotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getWishlist() {
        return wishlist;
    }

    public void setWishlist(Boolean wishlist) {
        this.wishlist = wishlist;
    }

}
