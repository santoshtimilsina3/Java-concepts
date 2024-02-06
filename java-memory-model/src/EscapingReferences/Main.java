package EscapingReferences;

import EscapingReferences.customerImplementation.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerRecords customers = new CustomerRecords();
        customers.addCustomer("santosh");
        customers.addCustomer("mantosh");
        customers.addCustomer("ram");

        for (Customer next : customers) {
            System.out.println(next);
        }

        for (Customer cust : customers.copyRecord().values()) {
            System.out.println(cust);
        }


        customers.getCustomers().clear();
        for (Customer cust : customers.unmodifiableCollection().values()) {
            System.out.println(cust);
        }

        ReadonlyCustomer santosh = customers.findCust("santosh");
        System.out.println(santosh);
    }
}
