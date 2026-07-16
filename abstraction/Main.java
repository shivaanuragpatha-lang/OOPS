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
        double amount = 0;
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
                System.out.println("Choose a UPI app:");
                System.out.println("1. Phonepe");
                System.out.println("2. Gpay");
                System.out.println("3. Bharatpe");
                System.out.println("4. paytm");
                int upiApp = sc.nextInt();
                switch(upiApp){
                    case 1:
                        System.out.println("Initiating payment through Phonepe ");
                        System.out.println("Enter the amount you want to pay: ");
                        break;
                    case 2:
                        System.out.println("Initiating payment through Gpay");
                        System.out.println("Enter the amount you want to pay:");
                        break;
                    case 3:
                        System.out.println("Initiating payment through Bharatpe");
                        System.out.println("Enter the amount you want to pay:");
                        break;
                    case 4:
                        System.out.println("Initiating payment through paytm");
                        System.out.println("Enter the amount you want to pay:");
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
                amount = sc.nextDouble();
                System.out.println("Enter the OTP:");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount)){
                    if (upiApp == 1) {
                        System.out.println("Payment done successfully using Phonepe");
                    }
                    else if (upiApp == 2)
                        System.out.println("Payment done successfully using Gpay");
                    else if (upiApp == 3)
                        System.out.println("Payment done successfully using Bharatpe");
                    else if (upiApp == 4)
                        System.out.println("Payment done successfully using Paytm");

                }


        }

        sc.close();

    }
}
