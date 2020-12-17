package com.classicsmart.myhomegrocers.models.cart;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyData implements Serializable
{

    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("symbol_left")
    @Expose
    private String symbolLeft;
    @SerializedName("symbol_right")
    @Expose
    private String symbolRight;
    @SerializedName("decimal_place")
    @Expose
    private String decimalPlace;
    @SerializedName("value")
    @Expose
    private String value;
    private final static long serialVersionUID = 5275222392401328259L;

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getSymbolLeft() {
        return symbolLeft;
    }

    public void setSymbolLeft(String symbolLeft) {
        this.symbolLeft = symbolLeft;
    }

    public String getSymbolRight() {
        return symbolRight;
    }

    public void setSymbolRight(String symbolRight) {
        this.symbolRight = symbolRight;
    }

    public String getDecimalPlace() {
        return decimalPlace;
    }

    public void setDecimalPlace(String decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
