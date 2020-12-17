package com.classicsmart.myhomegrocers.models.userAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmailPhoneValidataionData {
    @SerializedName("customer_exists")
    @Expose
    private Boolean customerExists;

    public Boolean getCustomerExists() {
        return customerExists;
    }

    public void setCustomerExists(Boolean customerExists) {
        this.customerExists = customerExists;
    }

}
