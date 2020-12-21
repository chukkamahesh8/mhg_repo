
package com.classicsmart.myhomegrocers.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteCartPayLoad implements Serializable
{

    @SerializedName("key")
    @Expose
    private String key;
    private final static long serialVersionUID = 8424121068922246674L;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
