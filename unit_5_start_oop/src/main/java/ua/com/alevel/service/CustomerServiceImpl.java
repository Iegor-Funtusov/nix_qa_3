package ua.com.alevel.service;

import ua.com.alevel.dao.CustomerDao;
import ua.com.alevel.dao.CustomerDaoImpl;
import ua.com.alevel.entity.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public void create(Customer customer) {
        if (!customerDao.existByEmail(customer.getEmail())) {
            customerDao.create(customer);
        }
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public void delete(String id) {
        customerDao.delete(id);
    }

    @Override
    public Customer findById(String id) {
        return customerDao.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
