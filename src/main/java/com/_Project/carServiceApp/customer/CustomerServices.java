package com._Project.carServiceApp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository cusrep;

    // Method to fetch customer profile by ID
    public Optional<Customer> getCusById(Integer customerid){
        return cusrep.findById(customerid);
    }

    //get all customers
    public List<Customer> getAllCustomers() {
        return cusrep.findAll();
    }

    //creating a new customer
    public void newCustomer(Customer customer){
        cusrep.save(customer);
    }

    //updating a current customer profile
    public void updateCustomer(Integer customerid, Customer customer){
        cusrep.save(customer);
    }

    public void deletebyId(int customerid){
        cusrep.deleteById(customerid);
    }

}
