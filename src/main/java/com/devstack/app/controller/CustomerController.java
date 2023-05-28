package com.devstack.app.controller;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;


    @RequestMapping("/all")
    public String allCustomers(Model model) {
        List<Customer> list = customerDao.findAllCustomers();
        model.addAttribute("customers", list);
        return "all-customers";
    }
}
