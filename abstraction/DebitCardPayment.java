package com.java.OOPS.abstraction;
public class DebitCardPayment extends Payment{
    public DebitCardPayment(String customerName, String paymentMode, String id, String paymentDate) {
        super(customerName, paymentMode, id, paymentDate);
    }


    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfully using Debit Card:"+amount);
        return true;
    }
}
