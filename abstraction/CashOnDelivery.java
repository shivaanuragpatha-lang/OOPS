package com.java.OOPS.abstraction;

public class CashOnDelivery extends Payment{
    public CashOnDelivery(String paymentMode, String id, String paymentDate) {
        super(paymentMode, id, paymentDate);
    }
    public boolean pay(double amount){
        System.out.println("Payment is done successfully using cash on delivery"+amount);
        return true;
    }
}
