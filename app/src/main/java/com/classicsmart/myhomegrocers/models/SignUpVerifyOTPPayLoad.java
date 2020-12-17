package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignUpVerifyOTPPayLoad {
   /* @SerializedName("email_otp")
    @Expose
    private String emailOtp;*/

    @SerializedName("telephone_otp")
    @Expose
    private String telephoneOtp;

    /*public String getEmailOtp() {
        return emailOtp;
    }

    public void setEmailOtp(String emailOtp) {
        this.emailOtp = emailOtp;
    }*/

    public String getTelephoneOtp() {
        return telephoneOtp;
    }

    public void setTelephoneOtp(String telephoneOtp) {
        this.telephoneOtp = telephoneOtp;
    }

}
