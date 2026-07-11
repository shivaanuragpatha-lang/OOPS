package com.java.OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Product 1", 100, 10, 4.5f, true);
        product.displayProductDetails();
        Laptop laptop1 = new Laptop(1,"laptop1",200000,(float)6.5, (float) 4.5F,true,128,8,"Windows OS");
        laptop1.displayLaptopDetails();
        Iphone iphone14 = new Iphone(12,"IPhone 14",51000,(float)30.0,(float)4.5,true,"12MP True Depth","12MP Main + 12MP Ultra Wide","6.1\" OLED (60Hz), Classic Notch, 1,200 nits peak","A15 Bionic chip, 4GB RAM, Basic Siri version");
        Iphone iphone15 = new Iphone(14,"IPhone15",51990,(float)25.0,(float)5,true,"12MP TrueDepth","48MP Fusion (with 2x optical zoom) + 12MP Ultra Wide","6.1\" OLED (60Hz), Dynamic Island, 2,000 nits peak","A16 Bionic chip, 6GB RAM, Basic Siri version");
        Iphone iphone16 = new Iphone(15,"Iphone16",69900,(float)33.0,(float)5.0,true,"12MP True Depth","48MP Fusion + 12MP Ultra Wide (Macro Mode & Spatial Capture)","6.1\" OLED (60Hz), Dynamic Island, 2,000 nits peak","A18 chip, 8GB RAM, Full Apple Intelligence");

        iphone14.displayIPhoneDetails();
        iphone15.displayIPhoneDetails();
        iphone16.displayIPhoneDetails();

    }
}
