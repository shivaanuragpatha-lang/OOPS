package com.java.OOPS.abstraction;

public class CashOnDelivery extends Payment{
    public CashOnDelivery(String customerName, String paymentMode, String id, String paymentDate) {
        super(customerName, paymentMode, id, paymentDate);
    }
    public boolean pay(double amount){
        System.out.println("Payment is done successfully using cash on delivery"+amount);
        return true;
    }
}
