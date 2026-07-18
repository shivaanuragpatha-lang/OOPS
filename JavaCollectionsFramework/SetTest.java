package com.java.OOPS.JavaCollectionsFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Shiva");
        s.add("Shashank");
        s.add("Karthik");
        s.add("Anurag");
        System.out.println(s);
        s.size();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            String name =(String) i.next();
            System.out.println(name.toUpperCase());

        }

    }
}
