package com.classicsmart.myhomegrocers.models.myOrders;

import com.classicsmart.myhomegrocers.models.dashboard.Options;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ProductDetails implements Serializable
{

    @SerializedName("product_category_name")
    @Expose
    private String productCategoryName;
    @SerializedName("product_category_id")
    @Expose
    private String productCategoryId;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("order_product_id")
    @Expose
    private String orderProductId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("option")
    @Expose
    private List<Options> option = null;
    @SerializedName("customer_request")
    @Expose
    private String customerRequest;
    @SerializedName("excluding_tax")
    @Expose
    private String excludingTax;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("original_price")
    @Expose
    private String originalPrice;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("price_raw")
    @Expose
    private Double priceRaw;
    @SerializedName("0")
    @Expose
    private String _0;
    @SerializedName("total_raw")
    @Expose
    private Double totalRaw;
    @SerializedName("reorder")
    @Expose
    private Object reorder;
    @SerializedName("return")
    @Expose
    private String _return;
    @SerializedName("products")
    @Expose
    private List<Object> products = null;
    @SerializedName("mixnmatch")
    @Expose
    private Boolean mixnmatch;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    private final static long serialVersionUID = 8571226532520577275L;

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(String orderProductId) {
        this.orderProductId = orderProductId;
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

    public List<Options> getOption() {
        return option;
    }

    public void setOption(List<Options> option) {
        this.option = option;
    }

    public String getCustomerRequest() {
        return customerRequest;
    }

    public void setCustomerRequest(String customerRequest) {
        this.customerRequest = customerRequest;
    }

    public String getExcludingTax() {
        return excludingTax;
    }

    public void setExcludingTax(String excludingTax) {
        this.excludingTax = excludingTax;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Double getPriceRaw() {
        return priceRaw;
    }

    public void setPriceRaw(Double priceRaw) {
        this.priceRaw = priceRaw;
    }

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public Double getTotalRaw() {
        return totalRaw;
    }

    public void setTotalRaw(Double totalRaw) {
        this.totalRaw = totalRaw;
    }

    public Object getReorder() {
        return reorder;
    }

    public void setReorder(Object reorder) {
        this.reorder = reorder;
    }

    public String getReturn() {
        return _return;
    }

    public void setReturn(String _return) {
        this._return = _return;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public Boolean getMixnmatch() {
        return mixnmatch;
    }

    public void setMixnmatch(Boolean mixnmatch) {
        this.mixnmatch = mixnmatch;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

}