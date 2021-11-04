package ua.com.alevel.dao;

import ua.com.alevel.entity.Customer;

import java.util.List;

public interface CustomerDao {

    void create(Customer customer);
    void update(Customer customer);
    void delete(String id);
    Customer findById(String id);
    List<Customer> findAll();
    boolean existByEmail(String email);
}
