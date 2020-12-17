package com.classicsmart.myhomegrocers.models.myOrders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MyOrdersData implements Serializable
{

    @SerializedName("orders")
    @Expose
    private List<Order> orders = null;
    @SerializedName("total_pages")
    @Expose
    private Long totalPages;
    @SerializedName("orderHistories")
    @Expose
    private String orderHistories;
    @SerializedName("latest_order")
    @Expose
    private String latestOrder;
    @SerializedName("tentativeDeliveryDateEnabled")
    @Expose
    private String tentativeDeliveryDateEnabled;
    private final static long serialVersionUID = -5969803768775235489L;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public String getOrderHistories() {
        return orderHistories;
    }

    public void setOrderHistories(String orderHistories) {
        this.orderHistories = orderHistories;
    }

    public String getLatestOrder() {
        return latestOrder;
    }

    public void setLatestOrder(String latestOrder) {
        this.latestOrder = latestOrder;
    }

    public String getTentativeDeliveryDateEnabled() {
        return tentativeDeliveryDateEnabled;
    }

    public void setTentativeDeliveryDateEnabled(String tentativeDeliveryDateEnabled) {
        this.tentativeDeliveryDateEnabled = tentativeDeliveryDateEnabled;
    }

}