package com.classicsmart.myhomegrocers.models.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddAddressData implements Serializable {

    @SerializedName("address_id")
    @Expose
    private Long addressId;
    private final static long serialVersionUID = -2984498907615755235L;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;

    }
}
