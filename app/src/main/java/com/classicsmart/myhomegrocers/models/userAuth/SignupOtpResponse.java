package com.classicsmart.myhomegrocers.models.userAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SignupOtpResponse {
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("error")
    @Expose
    private List<Error> error;
    @SerializedName("message")
    @Expose
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
