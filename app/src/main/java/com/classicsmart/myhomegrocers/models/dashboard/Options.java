package com.classicsmart.myhomegrocers.models.dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Options implements Serializable
{

    @SerializedName("product_option_id")
    @Expose
    private String productOptionId;
    @SerializedName("product_option_value")
    @Expose
    private List<ProductOptionValue> productOptionValue = null;
    @SerializedName("option_id")
    @Expose
    private String optionId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("required")
    @Expose
    private String required;
    private final static long serialVersionUID = -720179497379174660L;

    public String getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(String productOptionId) {
        this.productOptionId = productOptionId;
    }

    public List<ProductOptionValue> getProductOptionValue() {
        return productOptionValue;
    }

    public void setProductOptionValue(List<ProductOptionValue> productOptionValue) {
        this.productOptionValue = productOptionValue;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

}
