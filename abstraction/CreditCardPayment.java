package com.java.OOPS.abstraction;

public class CreditCardPayment extends Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Amount: " + amount);
        System.out.println("Payment is completed successfully using Credit Card" );
        return true;
    }
}
