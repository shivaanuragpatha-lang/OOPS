package com.java.OOPS.models;
import com.java.OOPS.JavaCollectionsFramework.Comparator.CustomerEamildescComparator;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Customers> customers = new HashSet<>();
        Customers customer1 = new Customers();
        Customers customer2 = new Customers();
        Customers customer3 = new Customers();
        Customers customer4 = new Customers();
        Customers customer5 = new Customers();
        customer1.setId(12)
                .setName("Sowmya Sri")
                .setAddress("Shatavahana University, sreeVillas")
                .setPhoneNo("123456789")
                .setEmail("customre1@gmail.com");

        customer2.setId(14)
                .setName("Sushma Sri")
                .setAddress("Shatavahana University, sreeVillas")
                .setPhoneNo("123554789")
                .setEmail("customer2@gmail.com");
        customer3.setId(15)
                .setName("Shashank")
                .setAddress("Kubera towers, Secunderabad")
                .setPhoneNo("1555483669")
                .setEmail("customer3@gmail.com");
        customer4.setId(16)
                .setName("Rahul")
                .setAddress("Beside Karimangar DMart, Karimnagar ")
                .setPhoneNo("7543218900")
                .setEmail("customer4@gmail.com");
        customer5.setId(17)
                .setName("Harshini")
                .setName("Harshini")
                .setPhoneNo("1482395600")
                .setEmail("customer5@gmail.com");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers.size());



    }
}
