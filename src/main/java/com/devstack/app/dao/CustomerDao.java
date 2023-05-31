package com.devstack.app.dao;

import com.devstack.app.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> findAllCustomers();


    public void saveCustomer(Customer customer);

    public Customer findCustomer(int id);
}
