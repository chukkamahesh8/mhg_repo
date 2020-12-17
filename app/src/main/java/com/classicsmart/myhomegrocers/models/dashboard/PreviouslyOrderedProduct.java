package com.classicsmart.myhomegrocers.models.dashboard;

import com.bumptech.glide.load.Option;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class PreviouslyOrderedProduct implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("options")
    @Expose
    private List<Options> options = null;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("rating")
    @Expose
    private Long rating;
    @SerializedName("reviews")
    @Expose
    private Long reviews;
    @SerializedName("wishlist")
    @Expose
    private Boolean wishlist;
    @SerializedName("cart_quantity")
    @Expose
    private Long cartQuantity;
    @SerializedName("out_of_stock")
    @Expose
    private Boolean outOfStock;
    @SerializedName("special")
    @Expose
    private Long special;
    @SerializedName("discount")
    @Expose
    private Long discount;
    private final static long serialVersionUID = 7308048482455603351L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Long getReviews() {
        return reviews;
    }

    public void setReviews(Long reviews) {
        this.reviews = reviews;
    }

    public Boolean getWishlist() {
        return wishlist;
    }

    public void setWishlist(Boolean wishlist) {
        this.wishlist = wishlist;
    }

    public Long getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(Long cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public Boolean getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Long getSpecial() {
        return special;
    }

    public void setSpecial(Long special) {
        this.special = special;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

}
