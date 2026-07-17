package com.java.OOPS.interfaces;
import com.java.OOPS.interfaces.DebitCard;
import com.java.OOPS.interfaces.OrderServices;

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
        OrderServices orderServices;
        Payment payment;
        double amount = 0;
        int otp;
        switch (choice) {
            case 1:
                payment = new CashOnDeliveryPayment();
                orderServices = new OrderServices(payment);
                System.out.println("Enter the amount:");
                amount = sc.nextDouble();
                if(orderServices.processOrder(amount)){
                    System.out.println("Payment processed successfully using cash");
                }
                break;
            case 2:
                payment = new CreditCard();
                orderServices = new OrderServices(payment);
                System.out.println("Enter the amount:");
                amount = sc.nextDouble();
                if(orderServices.processOrder(amount)){
                    System.out.println("Payment processed successfully using Credit Card");
                }
                break;
            case 3:
                payment = new DebitCard();
                orderServices = new OrderServices(payment);
                System.out.println("Enter the Amount:");
                amount = sc.nextDouble();
                if(orderServices.processOrder(amount)){
                    System.out.println("Payment processed successfully using Debit Card");
                }
                break;
            case 4:
                payment = new UPI();
                orderServices = new OrderServices(payment);
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
                if(orderServices.processOrder(amount)) {
                    if (upiApp == 1) {
                        System.out.println("Payment done successfully using Phonepe");
                    } else if (upiApp == 2)
                        System.out.println("Payment done successfully using Gpay");
                    else if (upiApp == 3)
                        System.out.println("Payment done successfully using Bharatpe");
                    else if (upiApp == 4)
                        System.out.println("Payment done successfully using Paytm");

                }
                break;
            default:
                System.out.println("Invalid choice");


        }

        sc.close();

    }
}
