package com.java.OOPS.Polymorphism;

public class AppleIPhone14 {
    String modelName;
    String model;
    String processor;
    String display;
    String frontCamera;
    String storage;

    public AppleIPhone14(String modelName, String processor, String frontCamera, String display, String storage) {
        this.modelName = modelName;
        this.processor = "HexaCore";
        this.frontCamera = "12MP True Depth";
        this.display = "6.1 inches";
        this.storage = "128GB";

    }
    void modelDetails(){
        System.out.println("IPhone Model:" + modelName);
        System.out.println("Processor   :" + processor);
        System.out.println("Display     :" + display);
        System.out.println("Front Camera:" + frontCamera);
        System.out.println("Storage     :" + storage);
    }

}
