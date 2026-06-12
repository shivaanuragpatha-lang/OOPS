//Create a Customer class that represents a user of the E-Commerce platform.
package com.java.OOPS;
public class Ecommerce {

    public class Customer {
        int customerIdentity;
        long phoneNo;
        String Address;
        boolean isAccountActive;

        public Customer(int customerIdentity,long phoneNo, String Address, boolean isAccountActive) {
            this.customerIdentity = customerIdentity;
            this.phoneNo = phoneNo;
            this.Address = Address;
            this.isAccountActive = isAccountActive;

        }
    }

    void main() {
        Customer customer;
        customer = new Customer(10,9440994600L,"Vemulawada",true);
        Customer customer2 = new Customer(11,6304789130L, "Hyderabad",true);
        Customer customer1 = new Customer(12,7569153690L,"Vemulawada",true);
        Customer customer3 = new Customer(14, 8328164747L,"Kondapur",true);
        System.out.println("CustomerID:"+customer1.customerIdentity);
        System.out.println("Contact No:"+customer1.phoneNo);
        System.out.println("Address:"+customer1.Address);
        System.out.println("Account Active:"+customer1.isAccountActive);
        System.out.println("CustomerID:"+customer2.customerIdentity);
        System.out.println("Address:"+customer2.Address);
        System.out.println("Contact No:"+customer2.phoneNo);
        System.out.println("Account Active:"+customer2.isAccountActive);
        System.out.println("CustomerID:"+customer3.customerIdentity);
        System.out.println("Address:"+customer3.Address);
        System.out.println("Contact No:"+customer3.phoneNo);
        System.out.println("Account Active:"+customer3.isAccountActive);
        }


}
