package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FeedBackPayload implements Serializable
{

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("feedback")
    @Expose
    private Feedback feedback;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("upload_images")
    @Expose
    private String uploadImages;
    private final static long serialVersionUID = -137782891873684616L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUploadImages() {
        return uploadImages;
    }

    public void setUploadImages(String uploadImages) {
        this.uploadImages = uploadImages;
    }

}