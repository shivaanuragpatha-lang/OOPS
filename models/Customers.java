package com.java.OOPS.models;

import java.util.Objects;

public class Customers implements Comparable<Customers>{

    /*
    private properties
     */
    private int id;
    private String name;
    private String email;
    private String phoneNo;
    private String address;

    public Customers(){
    }

    public int getId() {
        return id;
    }

    public Customers setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customers setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customers setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Customers setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customers setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customers customer = (Customers) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phoneNo, customer.phoneNo) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNo, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customers o) {
        return o.name.compareTo(this.name);
        /*
        Ascending
        return this.name.compareTo(o.name);
        Descending
        return o.name.compareTo(this.name);
         */
    }
}