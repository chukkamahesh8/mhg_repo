package com.classicsmart.myhomegrocers.models.dashboard;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubCategory {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("sub_categories")
    @Expose
    private List<SubCategory_> subCategories = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<SubCategory_> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory_> subCategories) {
        this.subCategories = subCategories;
    }

}
