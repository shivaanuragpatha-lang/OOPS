package com.java.OOPS.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public Product() {
        System.out.println("Product constructor called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    void displayProductDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("Discount: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
    }

}
