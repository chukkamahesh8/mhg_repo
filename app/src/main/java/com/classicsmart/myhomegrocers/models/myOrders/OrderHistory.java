package com.classicsmart.myhomegrocers.models.myOrders;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderHistory implements Serializable
{

    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("modified_date")
    @Expose
    private String modifiedDate;
    @SerializedName("modified_time")
    @Expose
    private String modifiedTime;
    private final static long serialVersionUID = 8941885598132756971L;

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}