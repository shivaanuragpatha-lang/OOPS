package com.java.OOPS.interfaces;

public class DebitCard implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfuly using Debit Card:"+amount);
        return true;
    }
    @Override
    public boolean pay(String CustomerID, double amount){
        return false;
    }
}
