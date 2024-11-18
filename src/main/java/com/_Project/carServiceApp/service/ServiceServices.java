/*
package com._Project.carServiceApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceServices {
    @Autowired
    private ServiceRepository servicerepo;

    // Method to fetch service by ID
    public Optional<Service> getServiceById(Integer serviceId){
        return servicerepo.findById(serviceId);
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
*/
