package com.classicsmart.myhomegrocers.models.dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductOptionValue implements Serializable
{

    @SerializedName("product_option_value_id")
    @Expose
    private String productOptionValueId;
    @SerializedName("option_value_id")
    @Expose
    private String optionValueId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("subtract")
    @Expose
    private String subtract;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("price_prefix")
    @Expose
    private String pricePrefix;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("weight_prefix")
    @Expose
    private String weightPrefix;
    private final static long serialVersionUID = -3731583109864855390L;

    public String getProductOptionValueId() {
    return productOptionValueId;
}

    public void setProductOptionValueId(String productOptionValueId) {
    this.productOptionValueId = productOptionValueId;
}

    public String getOptionValueId() {
    return optionValueId;
}

    public void setOptionValueId(String optionValueId) {
    this.optionValueId = optionValueId;
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

    public String getQuantity() {
    return quantity;
}

    public void setQuantity(String quantity) {
    this.quantity = quantity;
}

    public String getSubtract() {
    return subtract;
}

    public void setSubtract(String subtract) {
    this.subtract = subtract;
}

    public String getPrice() {
    return price;
}

    public void setPrice(String price) {
    this.price = price;
}

    public String getPricePrefix() {
    return pricePrefix;
}

    public void setPricePrefix(String pricePrefix) {
    this.pricePrefix = pricePrefix;
}

    public String getWeight() {
    return weight;
}

    public void setWeight(String weight) {
    this.weight = weight;
}

    public String getWeightPrefix() {
    return weightPrefix;
}

    public void setWeightPrefix(String weightPrefix) {
    this.weightPrefix = weightPrefix;
}

}