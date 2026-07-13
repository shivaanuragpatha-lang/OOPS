package com.java.OOPS.Polymorphism;

public class IPhone {
    public static void main(String[] args) {
        AppleIPhone14 appleIPhone14 = new AppleIPhone14("IPhone14","HexaCore","12MP True Depth","6.1 inches","128GB");
        appleIPhone14.modelDetails();
        AppleIPhone15 iPhone15 = new AppleIPhone15("IPhone15","HexaCore","12MP True Depth","6.1 inches","128GB",(short)3349,"iOS v17","48MP + 12MP",(byte)8,"Apple A16 Bionic");
        iPhone15.modelDetails();
        AppleIPhone16 iPhone16 = new AppleIPhone16("IPhone16","HexaCore","12MP True Depth","6.1 inches","128GB",(short)3561,"iOS v18","48MP + 12MP",(byte)8,"Apple A18");
        iPhone16.modelDetails();
    }
}
