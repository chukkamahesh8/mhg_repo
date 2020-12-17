package com.classicsmart.myhomegrocers.models.wishlist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WishListData implements Serializable {
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("product_seo_url")
    @Expose
    private String productSeoUrl;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("special")
    @Expose
    private Long special;
    private final static long serialVersionUID = -8420020321098474255L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductSeoUrl() {
        return productSeoUrl;
    }

    public void setProductSeoUrl(String productSeoUrl) {
        this.productSeoUrl = productSeoUrl;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getSpecial() {
        return special;
    }

    public void setSpecial(Long special) {
        this.special = special;
    }

}
