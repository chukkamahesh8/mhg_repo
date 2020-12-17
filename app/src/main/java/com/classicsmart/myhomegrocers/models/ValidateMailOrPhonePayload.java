package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidateMailOrPhonePayload {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("telephone")
    @Expose
    private String telephone;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
