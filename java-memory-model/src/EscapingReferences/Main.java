package EscapingReferences;

import EscapingReferences.customerImplementation.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerRecords customers = new CustomerRecords();
        customers.addCustomer("santosh");
        customers.addCustomer("mantosh");
        customers.addCustomer("ram");

        customers.getCustomers().clear(); //it clears the customers and it can be done from anywhere
        for (Customer next : customers.getCustomers().values()) {
            System.out.println(next);
        }
    }
}
