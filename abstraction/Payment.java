package com.java.OOPS.abstraction;

public abstract class Payment {
    String paymentMode;
    String id;
    String paymentDate;

    public Payment(String paymentMode, String id, String paymentDate, ) {
        this.paymentMode = paymentMode;
        this.id = id;
        this.paymentDate = paymentDate;

    }

    public abstract boolean pay(double amount);
    public void otpValidation(int otp){
        System.out.println("Enter your OTP:"+otp);
    }
    public void paymentValidation(){
        System.out.println("Enter your Payment Mode:"+paymentMode);
        System.out.println("Enter your ID:"+id);
        System.out.println("Enter your Payment Date:"+paymentDate);


    }


}
