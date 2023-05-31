package com.devstack.app.controller;

import com.devstack.app.dao.CustomerDao;
import com.devstack.app.entity.Customer;
import com.devstack.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")/*GET,POST,PUT,DELETE*/
    public String allCustomers(Model model){
        List<Customer> list = customerService.findAllCustomers();
        model.addAttribute("customers",list);
        return "all-customers";
    }

    @GetMapping("/new-customer-form")/*GET,POST,PUT,DELETE*/
    public String newCustomerFormLoader(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "new-customer-form";
    }

    @PostMapping("/new-customer")/*GET,POST,PUT,DELETE*/
    public String newCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customers/all";
    }

    @GetMapping("/update-ui-form")
    public String updateUiForm(@RequestParam("id") int id, Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "update-customer-form";
    }
}