package com.classicsmart.myhomegrocers.models.dashboard;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("banner")
    @Expose
    private List<Banner> banner = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("previously_ordered_products")
    @Expose
    private List<PreviouslyOrderedProduct> previouslyOrderedProducts = null;
    @SerializedName("cart_products")
    @Expose
    private List<CartProducts> cartProducts = null;
    @SerializedName("mhg_reward_balance")
    @Expose
    private Integer mhgRewardBalance;

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<PreviouslyOrderedProduct> getPreviouslyOrderedProducts() {
        return previouslyOrderedProducts;
    }

    public void setPreviouslyOrderedProducts(List<PreviouslyOrderedProduct> previouslyOrderedProducts) {
        this.previouslyOrderedProducts = previouslyOrderedProducts;
    }

    public List<CartProducts> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProducts> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public Integer getMhgRewardBalance() {
        return mhgRewardBalance;
    }

    public void setMhgRewardBalance(Integer mhgRewardBalance) {
        this.mhgRewardBalance = mhgRewardBalance;
    }

}
