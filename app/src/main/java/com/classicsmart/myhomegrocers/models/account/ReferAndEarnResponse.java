package com.classicsmart.myhomegrocers.models.account;

import com.classicsmart.myhomegrocers.models.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReferAndEarnResponse implements Serializable
{
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private ReferAndEarnData data;
    private final static long serialVersionUID = -4207119399943204068L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ReferAndEarnData getData() {
        return data;
    }

    public void setData(ReferAndEarnData data) {
        this.data = data;
    }

}