package EscapingReferences;

import EscapingReferences.customerImplementation.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CustomerRecords {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(String name) {
        this.records.put(name, new Customer(name));
    }

    public Map<String, Customer> getCustomers() {
        return records;
    }
}
