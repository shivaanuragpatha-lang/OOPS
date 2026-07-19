package com.java.OOPS.JavaCollectionsFramework.Comparator;
import java.util.Comparator;
import com.java.OOPS.models.Customers;
public class CustomerIDAscComparator implements Comparator<Customers> {
    @Override
    public int  compare(Customers c1, Customers c2) {
        return c1.getId() - c2.getId();
    }
}
