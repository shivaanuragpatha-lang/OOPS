package com.java.OOPS.abstraction;

public abstract class Payment {
    String customerName;
    String paymentMode;
    String id;
    String paymentDate;

    public Payment(String customerName, String paymentMode, String id, String paymentDate) {
        this.customerName = customerName;
        this.paymentMode = paymentMode;
        this.id = id;
        this.paymentDate = paymentDate;

    }

    public abstract boolean pay(double amount);
    public void otpValidation(int otp){
        System.out.println("Enter your OTP:"+otp);
    }
    public void paymentValidation(){
        System.out.println(" Payment Mode:"+paymentMode);
        System.out.println(" ID:"+id);
        System.out.println(" Payment Date:"+paymentDate);


    }


}
