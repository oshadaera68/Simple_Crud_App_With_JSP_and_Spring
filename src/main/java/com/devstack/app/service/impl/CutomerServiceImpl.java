package com.devstack.app.service.impl;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import com.devstack.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CutomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Transactional
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    public Customer findCustomer(int id) {
        return customerDao.findCustomer(id);
    }
}
