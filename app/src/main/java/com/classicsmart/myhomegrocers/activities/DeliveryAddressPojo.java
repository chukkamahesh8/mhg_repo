package com.classicsmart.myhomegrocers.activities;

public class DeliveryAddressPojo {
    public String home,name,doorNumber,area,location,city,pincode,phoneNumber;

    public DeliveryAddressPojo(String home,String name,String doorNumber,
                               String area,String location,String city,
                               String pincode,String phoneNumber){
        this.home=home;
        this.name=name;
        this.doorNumber=doorNumber;
        this.area=area;
        this.location=location;
        this.city=city;
        this.pincode=pincode;
        this.phoneNumber=phoneNumber;

    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
