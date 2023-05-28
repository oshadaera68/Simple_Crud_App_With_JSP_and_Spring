package com.devstack.app.dao.impl;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
/*Component--> (@Controller, Repository)*/
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Customer> findAllCustomers() {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM Customer", Customer.class).getResultList();
    }
}
