package com.java.OOPS.JavaCollectionsFramework.Comparator;

import com.java.OOPS.models.Customers;

import java.util.Comparator;

public class CustomerEamilAscComparator implements Comparator<Customers> {
    @Override
    public int compare(Customers c1, Customers c2) {
        return c1.getEmail().compareTo(c2.getEmail());
    }
}
