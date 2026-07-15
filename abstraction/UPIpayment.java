package com.java.OOPS.abstraction;

public class UPIpayment extends Payment{
    public UPIpayment(String customerName, String paymentMode, String id, String paymentDate) {
        super(customerName, paymentMode, id, paymentDate);
    }
    public boolean pay(double amount) {
        System.out.println("Payment doen successfully using UPI"+amount);
        return true;
    }
}
