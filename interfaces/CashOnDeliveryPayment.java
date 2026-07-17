package com.java.OOPS.interfaces;

public class CashOnDeliveryPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        Payment.validTransaction(4,1200);
        System.out.println("Payment done successfully: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }


}