package com.java.OOPS.inheritance;

public class Iphone extends Product {
    String processor;
    String display;
    String rearCamera;
    String frontCamera;

    public Iphone(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, String frontCamera, String rearCamera, String display, String processor) {
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
        this.display = display;
        this.processor = processor;
    }
    void displayIPhoneDetails() {
        super.displayProductDetails();
        System.out.println("-----------Features included------------");
        System.out.println("Front Camera:" + frontCamera);
        System.out.println("Rear Camera :" + rearCamera);
        System.out.println("Processor   :" + processor);
        System.out.println("Display     :" + display);
        System.out.println("-------------Thanks for visiting product------------");

    }
}
