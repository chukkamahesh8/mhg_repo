package com.classicsmart.myhomegrocers.models.userAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ForgotPasswordFinalResponse implements Serializable {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("error")
    @Expose
    private List<Error> error = null;
    @SerializedName("data")
    @Expose
    private SignupData data;

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

    public SignupData getData() {
        return data;
    }

    public void setData(SignupData data) {
        this.data = data;
    }

}
