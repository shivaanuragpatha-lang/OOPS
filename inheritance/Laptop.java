package com.java.OOPS.inheritance;


public class Laptop extends Product {
        int hardDiskSize;
        int ram;
        String operatingSystem;

        public Laptop() {
            super(); //super constructor call
            System.out.println("Laptop constructor called");
        }

        public Laptop(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, int hardDiskSize, int ram, String operatingSystem) {
            super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
            this.hardDiskSize = hardDiskSize;
            this.ram = ram;
            this.operatingSystem = operatingSystem;
        }

        void displayLaptopDetails() {
            super.displayProductDetails();
            System.out.println("------------Features of Laptop------------");
            System.out.println("Hard Disk Size: " + hardDiskSize);
            System.out.println("RAM: " + ram);
            System.out.println("Operating System: " + operatingSystem);
        }
}

