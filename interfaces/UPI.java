package com.java.OOPS.interfaces;

public class UPI implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfuly using UPI:"+amount);
        return true;
    }
    @Override
    public boolean pay(String CustomerID, double amount){
        return false;
    }
}
