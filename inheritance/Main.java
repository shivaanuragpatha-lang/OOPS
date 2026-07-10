package com.java.OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Product 1", 100, 10, 4.5f, true);
        product.displayProductDetails();
        Laptop laptop1 = new Laptop(1,"laptop1",200000,(float)6.5, (float) 4.5F,true,128,8,"Windows OS");
        laptop1.displayLaptopDetails();
        Iphone iphone14 = new Iphone(12,"IPhone 14",51000,(float)30.0,(float)4.5,true,"12MP True Depth","12MP Main + 12MP Ultra Wide","6.1\" OLED (60Hz), Classic Notch, 1,200 nits peak","A15 Bionic chip, 4GB RAM, Basic Siri version");
        iphone14.displayIPhoneDetails();

    }
}
