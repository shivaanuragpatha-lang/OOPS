package com.java.OOPS.functional;


import com.java.OOPS.models.Customers;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> length = (str) -> str.length() >= 5 && str.length() <= 10;
        System.out.println(length.test("Shiva"));

        Customers customer = new Customers();
        customer.setId(1431);
        customer.setName("Shiva");
        customer.setEmail("shiva1431@gmail.com");
        customer.setPhoneNo("+91-8023469517");
        customer.setAddress("Hyderabad");

        Consumer<Customers> printCustomer = (customer1) -> {
            System.out.println("Id : " + customer1.getId());
            System.out.println("Name :" + customer1.getName());
            System.out.println("Email : " + customer1.getEmail());
            System.out.println("Phone No : " + customer1.getPhoneNo());
            System.out.println("Address : " + customer1.getAddress());
        };
        printCustomer.accept(customer);
    }
}
