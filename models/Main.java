package com.java.OOPS.models;
import com.java.OOPS.models.Customers;
public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setId(12);
        customers.setName("Sowmya Sri");
        customers.setAddress("Shatavahana University, sreeVillas");
        customers.setEmail("customre1@gmail.com");
        System.out.println("Customer ID: " + customers.getId());
        System.out.println("Customer Name: " + customers.getName());
        System.out.println("Customer Address: " + customers.getAddress());
        System.out.println("Customer Email: " + customers.getEmail());
        System.out.println(customers);

    }
}
