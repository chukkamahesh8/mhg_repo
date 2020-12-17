
package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyOtpPayLoad {

    @SerializedName("otp")
    @Expose
    private String otp;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("confirm")
    @Expose
    private String confirm;

    public int getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

}
