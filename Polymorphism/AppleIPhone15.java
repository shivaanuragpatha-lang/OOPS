package com.java.OOPS.Polymorphism;

public class AppleIPhone15 extends AppleIPhone14 {
    short battery;
    String performance;
    byte ram;
    String rearCamera;
    String os;

    public AppleIPhone15(String processor, String frontCamera, String display, String storage, short battery, String os, String rearCamera, byte ram, String performance) {
        super(processor, frontCamera, display, storage);
        this.battery = battery;
        this.os = os;
        this.rearCamera = rearCamera;
        this.ram = ram;
        this.performance = performance;
    }

    @Override
    void modelDetails(){
        super.modelDetails();
        System.out.println("Battery    :" + battery+"mAH");
        System.out.println("Rear Camera:" + rearCamera);
        System.out.println("RAM        :" + ram+"GB");
        System.out.println("Performance:" + performance);
        System.out.println("OS         :" + os);
    }
}
