package com.java.OOPS.interfaces;

public interface Payment {
    int MAX_PAYMENT_AMOUNT = 10000;
    int MAX_TRANSACTIONS_ALLOWED = 3;

    boolean pay(double amount);
    boolean pay(String customerID, double amount );

    default void  otpValidation(int otp){
        System.out.println("OTP validation done:"+otp);
    }
    static boolean validTransaction(int myTransactionCount, double paymentAmount){
        return (myTransactionCount <= MAX_TRANSACTIONS_ALLOWED) && (paymentAmount <= MAX_PAYMENT_AMOUNT);
    }
}