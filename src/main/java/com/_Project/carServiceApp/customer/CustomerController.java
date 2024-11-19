package com._Project.carServiceApp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerService;

    //change for MVC PROFILE CUSTOMERID
    @GetMapping("/profile/{customerid}")
    public String getCustomerProfileById(@PathVariable int customerid, Model model){
        Customer customer = customerService.getCusById(customerid).orElseThrow(() -> new RuntimeException("Customer not found"));
        model.addAttribute("customer", customer);
        model.addAttribute("title", customerid);
        return "customer";
    }
    /*public Optional<Customer> getCustomerProfileById(@PathVariable int id) {
        return customerService.getCusById(id);
    }*/

    //gets all customers
    /*@GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }*/

    /*//adding a new customer
    @PostMapping("/new")
    public List<Customer> newCustomer(@RequestBody Customer customer) {
        customerService.newCustomer(customer);
        return customerService.getAllCustomers();
    }*/

    //CHANGES FOR MVC NEW
    @GetMapping("/new")
    public String createNewCust(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-signup";
    }
    //adding new customer
    @PostMapping("/new")
    public String newCustomer(Customer customer){
        customerService.newCustomer(customer);
        return "redirect:/customer";
    }

    //FOR MVC CHANGE SHOWING SIGNUP SCREEN
    @GetMapping("/signup")
    public String showSignup(){
        return "customer-signup";
    }

    //updating a customer that is in db
    /*@PutMapping("/update/{cusomterId}")
    public List<Customer> updateCustomer(@PathVariable int customerid, @RequestBody Customer customer){
        customerService.updateCustomer(customerid,customer);
        return customerService.getAllCustomers();
    }*/

    //CHANGES FOR MVC UPDATE
    @GetMapping("/update/{customerid}")
    public String showUpdateForm(@PathVariable int customerid, Model model){
        Customer customer = customerService.getCusById(customerid).orElseThrow(() -> new RuntimeException("Could not find customer"));
        model.addAttribute("customer", customer);
        return "customer-signup";
    }

    @PostMapping("/update")
    public String updateCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/profile/" + customer.getId();
    }

    /*//Deleting a customer by their id
    @DeleteMapping("/delete/{customerId}")
    public List<Customer> deletebyCustomerId(@PathVariable int customerid){
        customerService.deletebyId(customerid);
        return customerService.getAllCustomers();
    }*/

    //CHANGES FOR MVC DELETE
    @GetMapping("/delete/{customerid}")
    public String deletebyCustomerId(@PathVariable int customerid){
        customerService.deletebyId(customerid);
        return "redirect:/customer";
    }


}