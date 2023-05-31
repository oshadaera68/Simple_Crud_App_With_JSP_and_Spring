package com.devstack.app.service;

import com.devstack.app.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    void saveCustomer(Customer customer);

    Customer findCustomer(int id);
}
