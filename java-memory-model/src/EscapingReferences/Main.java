package EscapingReferences;

import EscapingReferences.customerImplementation.Customer;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomerRecords customers = new CustomerRecords();
        customers.addCustomer("santosh");
        customers.addCustomer("mantosh");
        customers.addCustomer("ram");

        for (Customer next : customers) {
            System.out.println(next);
        }

        customers.getCustomers().clear();
        for (Customer cust : customers.copyRecord().values()) {
            System.out.println(cust);
        }

    }
}
