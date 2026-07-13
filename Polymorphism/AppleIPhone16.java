package com.java.OOPS.Polymorphism;

public class AppleIPhone16 extends AppleIPhone15 {
    public AppleIPhone16(String modelName, String processor, String frontCamera, String display, String storage, short battery, String os, String rearCamera, byte ram, String performance) {
        super(modelName, processor, frontCamera, display, storage, battery, os, rearCamera, ram, performance);

    }

    @Override
    public void modelDetails(){
        super.modelDetails();
    }
}
