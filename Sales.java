package com.java.OOPS;


public class Sales {
    public class Order {
        int OrderID;
        String Customer_Reference;
        Double Order_Amount;
        String Order_Date;
        String Order_Status;
        String Payment_Status;

        public Order(int orderID, String order_Date, double order_Amount, String customer_Reference, String order_Status, String payment_Status) {
            this.OrderID = orderID;
            this.Order_Date = order_Date;
            this.Order_Amount = order_Amount;
            this.Customer_Reference = customer_Reference;
            this.Order_Status = order_Status;
            this.Payment_Status = payment_Status;

        }
    }
    void main() {
        Order order = new Order(1,"20-05-2026",5500.0,"Amazon Fire-stick","DONE","DONE");
        Order order1 = new Order(2,"12-04-2026",1500.0,"Television","PENDING","DONE");
        Order order2 = new Order(12,"26-02-2026",5000,"Boat products","PENDING","DONE");
        Order order3 = new Order(5,"20-03-2026",112000.0,"SAMSUNG_Flip-7","DELIVERED","DONE");
        System.out.println("--------------order--------------");
        System.out.println("OrderID:"+order.OrderID);
        System.out.println("Customer_Reference:"+order.Customer_Reference);
        System.out.println("Order_Amount:"+order.Order_Amount);
        System.out.println("Order_Date:"+order.Order_Date);
        System.out.println("Order_Status:"+order.Order_Status);
        System.out.println("Payment_Status:"+order.Payment_Status);
        System.out.println("--------------order1--------------");
        System.out.println("OrderID:"+order1.OrderID);
        System.out.println("Customer_Reference:"+order1.Customer_Reference);
        System.out.println("Order_Amount:"+order1.Order_Amount);
        System.out.println("Order_Date:"+order1.Order_Date);
        System.out.println("Order_Status:"+order1.Order_Status);
        System.out.println("Payment_Status:"+order1.Payment_Status);
        System.out.println("--------------order2--------------");
        System.out.println("OrderID:"+order2.OrderID);
        System.out.println("Customer_Reference:"+order2.Customer_Reference);
        System.out.println("Order_Amount:"+order2.Order_Amount);
        System.out.println("Order_Date:"+order2.Order_Date);
        System.out.println("Order_Status:"+order2.Order_Status);
        System.out.println("Payment_Status:"+order2.Payment_Status);
        System.out.println("--------------order3--------------");
        System.out.println("OrderID:"+order3.OrderID);
        System.out.println("Customer_Reference:"+order3.Customer_Reference);
        System.out.println("Order_Amount:"+order3.Order_Amount);
        System.out.println("Order_Date:"+order3.Order_Date);
        System.out.println("Order_Status:"+order3.Order_Status);
        System.out.println("Payment_Status:"+order3.Payment_Status);


    }
}

