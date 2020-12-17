
package com.classicsmart.myhomegrocers.models.address;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable
{

    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    private final static long serialVersionUID = 3876816416723324677L;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
