package com.classicsmart.myhomegrocers.activities;

public class OffersPojo {
    public String title,description,time;

    public OffersPojo(String title,String description,String time){
        this.title=title;
        this.description=description;
        this.time=time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void getTime(String time) {
        this.time = time;
    }
}
