
package com.classicsmart.myhomegrocers.models.address;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddAddressResponse implements Serializable
{

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private AddAddressData data;
    private final static long serialVersionUID = -3173877126506861149L;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AddAddressData getData() {
        return data;
    }

    public void setData(AddAddressData data) {
        this.data = data;
    }

}
