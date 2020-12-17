package com.classicsmart.myhomegrocers.models.myOrders;

import com.classicsmart.myhomegrocers.models.cart.Product;
import com.classicsmart.myhomegrocers.models.cart.Total;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class OrderDetailsData implements Serializable
{

    @SerializedName("invoice_no")
    @Expose
    private String invoiceNo;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("tentative_delivery_date")
    @Expose
    private String tentativeDeliveryDate;
    @SerializedName("cancel")
    @Expose
    private String cancel;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("delivery_date")
    @Expose
    private String deliveryDate;
    @SerializedName("default_address")
    @Expose
    private String defaultAddress;
    @SerializedName("shipping_address")
    @Expose
    private String shippingAddress;
    @SerializedName("pickup_delivery_mode")
    @Expose
    private String pickupDeliveryMode;
    @SerializedName("delivery_time")
    @Expose
    private String deliveryTime;
    @SerializedName("pickup_time")
    @Expose
    private String pickupTime;
    @SerializedName("pickup_address")
    @Expose
    private String pickupAddress;
    @SerializedName("pickup_location")
    @Expose
    private String pickupLocation;
    @SerializedName("pickup_short_location")
    @Expose
    private String pickupShortLocation;
    @SerializedName("products")
    @Expose
    private List<ProductDetails> products = null;
    @SerializedName("vouchers")
    @Expose
    private List<Object> vouchers = null;
    @SerializedName("totals")
    @Expose
    private List<Total> totals = null;
    @SerializedName("pending_payment")
    @Expose
    private String pendingPayment;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("orderHistories")
    @Expose
    private List<OrderHistory> orderHistories = null;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    private final static long serialVersionUID = 6411838227075361956L;

    public String getInvoiceNo() {
    return invoiceNo;
}

    public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
}

    public String getOrderId() {
    return orderId;
}

    public void setOrderId(String orderId) {
    this.orderId = orderId;
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

    public String getCancel() {
    return cancel;
}

    public void setCancel(String cancel) {
    this.cancel = cancel;
}

    public String getPaymentMethod() {
    return paymentMethod;
}

    public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
}

    public String getDeliveryDate() {
    return deliveryDate;
}

    public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
}

    public String getDefaultAddress() {
    return defaultAddress;
}

    public void setDefaultAddress(String defaultAddress) {
    this.defaultAddress = defaultAddress;
}

    public String getShippingAddress() {
    return shippingAddress;
}

    public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
}

    public String getPickupDeliveryMode() {
    return pickupDeliveryMode;
}

    public void setPickupDeliveryMode(String pickupDeliveryMode) {
    this.pickupDeliveryMode = pickupDeliveryMode;
}

    public Object getDeliveryTime() {
    return deliveryTime;
}

    public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
}

    public Object getPickupTime() {
    return pickupTime;
}

    public void setPickupTime(String pickupTime) {
    this.pickupTime = pickupTime;
}

    public String getPickupAddress() {
    return pickupAddress;
}

    public void setPickupAddress(String pickupAddress) {
    this.pickupAddress = pickupAddress;
}

    public String getPickupLocation() {
    return pickupLocation;
}

    public void setPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
}

    public String getPickupShortLocation() {
    return pickupShortLocation;
}

    public void setPickupShortLocation(String pickupShortLocation) {
    this.pickupShortLocation = pickupShortLocation;
}

    public List<ProductDetails> getProducts() {
    return products;
}

    public void setProducts(List<ProductDetails> products) {
    this.products = products;
}

    public List<Object> getVouchers() {
    return vouchers;
}

    public void setVouchers(List<Object> vouchers) {
    this.vouchers = vouchers;
}

    public List<Total> getTotals() {
    return totals;
}

    public void setTotals(List<Total> totals) {
    this.totals = totals;
}

    public String getPendingPayment() {
    return pendingPayment;
}

    public void setPendingPayment(String pendingPayment) {
    this.pendingPayment = pendingPayment;
}

    public String getComment() {
    return comment;
}

    public void setComment(String comment) {
    this.comment = comment;
}

    public List<OrderHistory> getOrderHistories() {
    return orderHistories;
}

    public void setOrderHistories(List<OrderHistory> orderHistories) {
    this.orderHistories = orderHistories;
}

    public Long getTimestamp() {
    return timestamp;
}

    public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
}

}