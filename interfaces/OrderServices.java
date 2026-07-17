package com.java.OOPS.interfaces;

public class OrderServices {
    Payment payment;
    public OrderServices(Payment payment){
        this.payment = payment;
    }
    public boolean processOrder(double amount){
        return payment.pay(amount);
    }
}
