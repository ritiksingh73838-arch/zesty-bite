package com.food.zesty.bite.entity;

public class MenuItem {

    private String name;
    private String category;
    private String description;
    private boolean isVeg;
    private double price;

    public MenuItem(String name, String category,
                    String description, boolean isVeg, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.isVeg = isVeg;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private String id ;
    public String getId(){return id;}
    public void setId(String id ){this.id=id;}
}
