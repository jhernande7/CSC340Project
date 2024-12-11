package com._Project.carServiceApp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerService;

    @GetMapping("/profile/{customerid}")
    public String getCustomerProfileById(@PathVariable int customerid, Model model){
        Customer customer = customerService.getCusById(customerid).orElseThrow(() -> new RuntimeException("Customer not found"));
        model.addAttribute("customer", customer);
        model.addAttribute("title", customerid);
        return "CustomerDashboard";
    }


    //adding a new customer with MVC changes
    @GetMapping("/new")
    public String createNewCust(Model model){
        model.addAttribute("customer", new Customer());
        return "CustomerSignup";
    }

    //updating a customer that is in db
    @PostMapping("/new")
    public String newCustomer(Customer customer){
        customerService.newCustomer(customer);
        return "redirect:/customer/profile/" + customer.getId();
    }

    //for MVC CHANGE TO SHOW SIGN UP SCREEN
    @GetMapping("/signup")
    public String showSignup(){
        return "CustomerSignup";
    }

    //changes for updateing customer with mvc control
    @GetMapping("/update/{customerid}")
    public String showUpdateForm(@PathVariable int customerid, Model model){
        Customer customer = customerService.getCusById(customerid).orElseThrow(() -> new RuntimeException("Could not find customer"));
        model.addAttribute("customer", customer);
        return "CustomerSignup";
    }

    @PostMapping("/update")
    public String updateCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/profile/" + customer.getId();
    }


    //Deleting a customer by their id
    @GetMapping("/delete/{customerId}")
    public String deletebyCustomerId(@PathVariable int customerid){
        customerService.deletebyId(customerid);
        return "redirect:/samplelogin";
    }


}