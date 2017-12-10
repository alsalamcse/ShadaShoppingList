package com.hsarme.shada.shadashoppinglist.Data;

/**
 * Created by Shada on 06/11/2017.
 * This class represent a product that will be at the shopping list
 */

public class Product {
    private String name;
    private double price;
    private double amount;
    /**
     * if the product is bought.
     */
    private boolean isCompleted;
    /**
     * the path of product's image.
     */
    private String imgPath;
    /**
     * a special key or ID unique for each product (primary key)
     */
    private String keyId;

    /**
     * building product
     * @param name
     * @param price
     * @param amount
     */
    public Product(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        isCompleted=false;
        imgPath=null;
    }

    public Product(String name, double price, double amount, boolean isCompleted, String imgPath, String keyId) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.isCompleted = isCompleted;
        this.imgPath = imgPath;
        this.keyId = keyId;
    }

    public Product(){}


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", isCompleted=" + isCompleted +
                ", imgPath='" + imgPath + '\'' +
                ", keyId='" + keyId + '\'' +
                '}';
    }
}
