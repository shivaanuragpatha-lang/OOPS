package com.java.OOPS.abstraction;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your options:");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. UPI payment");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        OrderService orderService;
        Payment payment;
        double amount;
        int otp;
        switch (choice) {
            case 1:
                payment = new CashOnDelivery("Anurag","Cash On Delivery","A81","11-04-2025");
                orderService = new OrderService(payment);
                System.out.println("Enter the amount you want to pay:");
                amount = sc.nextDouble();
                System.out.println("Enter the OTP:");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Payment processed successfully using cash");
                }
            case 2:
                payment = new CreditCardPayment("Karthik","Credit Card","A62","04-06-2025");
                orderService = new OrderService(payment);
                System.out.println("Enter the amount you want to pay:");
                amount = sc.nextDouble();
                System.out.println("Enter the OTP:");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Payment processed successfully using cash");
                }
            case 3:
                payment = new DebitCardPayment("Shiva","Debit Card","A41","14-06-2025");
                orderService = new OrderService(payment);
                System.out.println("Enter the amount you want to pay:");
                amount = sc.nextDouble();
                System.out.println("Enter the OTP:");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Payment processed successfully using Debit Card");
                }
            case 4:
                payment = new UPIpayment("Manisai","UPI","A64","12-05-2025");
                orderService = new OrderService(payment);
                System.out.println("Enter the amount you want to pay:");
                amount = sc.nextDouble();
                System.out.println("Enter the OTP:");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    System.out.println("Payment processed successfully using Debit Card");
                }


        }

        sc.close();

    }
}
