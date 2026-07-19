package com.java.OOPS.JavaCollectionsFramework.Comparator;
import java.util.Comparator;
import com.java.OOPS.models.Customers;
public class CustomerIDdescComparator implements Comparator<Customers> {
    @Override
    public int compare(Customers c1, Customers c2) {
        return c2.getId() -  c1.getId();
    }
}
