package com.java.OOPS.abstraction;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(String paymentMode, String id, String paymentDate) {
        super(paymentMode, id, paymentDate);
        
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Amount: " + amount);
        System.out.println("Payment is completed successfully using Credit Card" );
        return true;
    }
}
