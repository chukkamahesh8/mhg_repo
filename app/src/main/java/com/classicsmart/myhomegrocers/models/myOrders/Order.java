package com.classicsmart.myhomegrocers.models.myOrders;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order implements Serializable
{

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("curr_stat")
    @Expose
    private String currStat;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("tentative_delivery_date")
    @Expose
    private String tentativeDeliveryDate;
    @SerializedName("delivery_time")
    @Expose
    private String deliveryTime;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("products")
    @Expose
    private Long products;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("view")
    @Expose
    private String view;
    @SerializedName("invoice")
    @Expose
    private String invoice;
    @SerializedName("cancel")
    @Expose
    private String cancel;
    @SerializedName("edit")
    @Expose
    private String edit;
    @SerializedName("rating_total")
    @Expose
    private String ratingTotal;
    @SerializedName("rating")
    @Expose
    private Object rating;
    @SerializedName("payment_code")
    @Expose
    private String paymentCode;
    @SerializedName("imageName")
    @Expose
    private String imageName;
    @SerializedName("enable_feedback")
    @Expose
    private Boolean enableFeedback;
    private final static long serialVersionUID = 5637290524584403471L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrStat() {
        return currStat;
    }

    public void setCurrStat(String currStat) {
        this.currStat = currStat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getTentativeDeliveryDate() {
        return tentativeDeliveryDate;
    }

    public void setTentativeDeliveryDate(String tentativeDeliveryDate) {
        this.tentativeDeliveryDate = tentativeDeliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getRatingTotal() {
        return ratingTotal;
    }

    public void setRatingTotal(String ratingTotal) {
        this.ratingTotal = ratingTotal;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Boolean getEnableFeedback() {
        return enableFeedback;
    }

    public void setEnableFeedback(Boolean enableFeedback) {
        this.enableFeedback = enableFeedback;
    }

}
