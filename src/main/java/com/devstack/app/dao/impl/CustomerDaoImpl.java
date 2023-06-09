package com.devstack.app.dao.impl;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/*Component--> (@Controller, Repository)*/
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Customer> findAllCustomers() {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM Customer", Customer.class).getResultList();
    }

    public void saveCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }

    public Customer findCustomer(long id) {
        return sessionFactory.getCurrentSession().find(Customer.class,id);
    }
}
