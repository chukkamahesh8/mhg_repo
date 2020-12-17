package com.classicsmart.myhomegrocers.models;

import com.classicsmart.myhomegrocers.models.account.Reasons;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CancelOrderPayload implements Serializable
{

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("reasons")
    @Expose
    private CancelReasons reasons;
    @SerializedName("cancel_comments")
    @Expose
    private String cancelComments;
    private final static long serialVersionUID = -1591313456965663593L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CancelReasons getReasons() {
        return reasons;
    }

    public void setReasons(CancelReasons reasons) {
        this.reasons = reasons;
    }

    public String getCancelComments() {
        return cancelComments;
    }

    public void setCancelComments(String cancelComments) {
        this.cancelComments = cancelComments;
    }

}