package ua.com.alevel.dao;

import ua.com.alevel.db.DBInMemory;
import ua.com.alevel.entity.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private final DBInMemory db = DBInMemory.getInstance();

    @Override
    public void create(Customer customer) {
        db.insert(customer);
    }

    @Override
    public void update(Customer customer) {
        db.update(customer);
    }

    @Override
    public void delete(String id) {
        db.delete(id);
    }

    @Override
    public Customer findById(String id) {
        return db.selectById(id);
    }

    @Override
    public List<Customer> findAll() {
        return db.selectAll();
    }

    @Override
    public boolean existByEmail(String email) {
        return db.existByEmail(email);
    }
}
