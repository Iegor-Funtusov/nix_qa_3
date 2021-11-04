package ua.com.alevel.db;

import ua.com.alevel.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DBInMemory {

    private final List<Customer> customers = new ArrayList<>();
    private final static DBInMemory instance = new DBInMemory();

    private DBInMemory() { }

    public static DBInMemory getInstance() {
        return instance;
    }

    public void insert(Customer customer) {
        customer.setId(generateId());
        customers.add(customer);
    }

    public Customer selectById(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> selectAll() {
        return customers;
    }

    public void delete(String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }

    public void update(Customer customer) {
        for (Customer current : customers) {
            if (current.getId().equals(customer.getId())) {
                current = customer;
            }
        }
    }

    public boolean existByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return generateId();
            }
        }
        return id;
    }
}
