package com._Project.carServiceApp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerService;

    @GetMapping("/profile/{id}")
    public Optional<Customer> getCustomerProfileById(@PathVariable int id) {
        return customerService.getCusById(id);
    }

    //gets all customers
    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //adding a new customer
    @PostMapping("/new")
    public List<Customer> newCustomer(@RequestBody Customer customer) {
        customerService.newCustomer(customer);
        return customerService.getAllCustomers();
    }

    //updating a customer that is in db
    @PutMapping("/update/{cusomterId}")
    public List<Customer> updateCustomer(@PathVariable int customerid, @RequestBody Customer customer){
        customerService.updateCustomer(customerid,customer);
        return customerService.getAllCustomers();
    }

    //Deleting a customer by their id
    @DeleteMapping("/delete/{customerId}")
    public List<Customer> deletebyCustomerId(@PathVariable int customerid){
        customerService.deletebyId(customerid);
        return customerService.getAllCustomers();
    }


}