package com.classicsmart.myhomegrocers.models.userAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmailOrPhoneValidationResponse {
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("error")
    @Expose
    private List<Error> error = null;
    @SerializedName("data")
    @Expose
    private EmailPhoneValidataionData data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Error> getError() {
        return error;
    }

    public void setError(List<Error> error) {
        this.error = error;
    }

    public EmailPhoneValidataionData getData() {
        return data;
    }

    public void setData(EmailPhoneValidataionData data) {
        this.data = data;
    }

}
