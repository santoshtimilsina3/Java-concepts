package EscapingReferences.customerImplementation;

import EscapingReferences.ReadonlyCustomer;

public class Customer implements ReadonlyCustomer {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(ReadonlyCustomer c) {
        this.name = c.getName();
    }

    public Customer(Customer customer) {
        this.name = customer.getName();
    }

    @Override
    public String toString() {
        return name;
    }

}
