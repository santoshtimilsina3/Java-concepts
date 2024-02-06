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

        /* Not totally solves the problem but makes it difficut
        Iterator<Customer> iterator = customers.iterator();
        iterator.next();
        iterator.remove();
         * */

    }
}
