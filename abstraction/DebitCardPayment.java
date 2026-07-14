package com.java.OOPS.abstraction;

public class DebitCardPayment extends Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfully using Debit Card:"+amount);
        return true;
    }
}
