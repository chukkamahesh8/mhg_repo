
package com.classicsmart.myhomegrocers.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetPasswordPayLoad {

    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("confirm")
    @Expose
    private String confirm;

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

}
