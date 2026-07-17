package com.java.OOPS.Encapsulation.p1;

public class A {
    protected int value =100;

    public A() {
        System.out.println("A() constructor is called");
    }
    public void m1(){
        System.out.println("m1() method is called");
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.value);
    }


}
