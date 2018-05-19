package com.amin.flowersapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Flower {

    @SerializedName("category")
    private String category;
    private String instructions;
    private String name;
    private String photo;
    private double price;
    @Expose(serialize = true,deserialize = true)
    private int productId;

    public String getCategory() {
        return category;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }
}
