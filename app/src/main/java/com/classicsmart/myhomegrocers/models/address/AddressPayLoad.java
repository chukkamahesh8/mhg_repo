package com.classicsmart.myhomegrocers.models.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddressPayLoad implements Serializable {

@SerializedName("firstname")
@Expose
private String firstname;
@SerializedName("lastname")
@Expose
private String lastname;
@SerializedName("company")
@Expose
private String company;
@SerializedName("address_1")
@Expose
private String address1;
@SerializedName("address_2")
@Expose
private String address2;
@SerializedName("city")
@Expose
private String city;
@SerializedName("postcode")
@Expose
private String postcode;
@SerializedName("country_id")
@Expose
private String countryId;
@SerializedName("zone_id")
@Expose
private String zoneId;
@SerializedName("default")
@Expose
private String _default;

public String getFirstname() {
return firstname;
}

public void setFirstname(String firstname) {
this.firstname = firstname;
}

public String getLastname() {
return lastname;
}

public void setLastname(String lastname) {
this.lastname = lastname;
}

public String getCompany() {
return company;
}

public void setCompany(String company) {
this.company = company;
}

public String getAddress1() {
return address1;
}

public void setAddress1(String address1) {
this.address1 = address1;
}

public String getAddress2() {
return address2;
}

public void setAddress2(String address2) {
this.address2 = address2;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getPostcode() {
return postcode;
}

public void setPostcode(String postcode) {
this.postcode = postcode;
}

public String getCountryId() {
return countryId;
}

public void setCountryId(String countryId) {
this.countryId = countryId;
}

public String getZoneId() {
return zoneId;
}

public void setZoneId(String zoneId) {
this.zoneId = zoneId;
}

public String getDefault() {
return _default;
}

public void setDefault(String _default) {
this._default = _default;
}

}