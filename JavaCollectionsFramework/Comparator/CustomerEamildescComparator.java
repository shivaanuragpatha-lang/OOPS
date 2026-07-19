package com.java.OOPS.JavaCollectionsFramework.Comparator;
import com.java.OOPS.models.Customers;
import java.util.Comparator;

public class CustomerEamildescComparator implements Comparator<Customers> {
    @Override
    public int compare(Customers c1, Customers c2) {
        return c2.getEmail().compareTo(c1.getEmail());
    }
}
