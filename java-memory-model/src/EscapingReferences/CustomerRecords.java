package EscapingReferences;

import EscapingReferences.customerImplementation.Customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CustomerRecords implements Iterable<Customer> {
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

    @Override
    public Iterator<Customer> iterator() {
        return this.records.values().iterator();
    }

    public HashMap<String, Customer> copyRecord() {
        return new HashMap<String, Customer>(records);
    }

    public Map<String, Customer> unmodifiableCollection() {
        return Collections.unmodifiableMap(this.records);
/*    return  Map.copyOf(this.records);
after java 10 copyOf is available and more optimized than  Collections.unmodifiableMap()
 */
    }


}
