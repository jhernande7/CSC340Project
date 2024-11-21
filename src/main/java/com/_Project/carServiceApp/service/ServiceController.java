/*
package com._Project.carServiceApp.service;

import com._Project.carServiceApp.customer.Customer;
import com._Project.carServiceApp.customer.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceServices serviceserv;

    @GetMapping("/{serviceid}")
    public Optional<Service> getServiceById(@PathVariable int id) {
        return serviceserv.getServiceById(id);
    }

    //gets all services
    @GetMapping("/all")
    public List<Service> getAllService(){
        return serviceserv.getAllServices();
    }

    //adding a new service
    @PostMapping("/new")
    public List<Service> newService(@RequestBody Service serv) {
        serviceserv.newService(serv);
        return serviceserv.getAllServices();
    }

    //updating a service that is in db
    @PutMapping("/update/{serviceId}")
    public List<Service> updateService(@PathVariable int serviceId, @RequestBody Service servo){
        serviceserv.updateService(serviceId,servo);
        return serviceserv.getAllServices();
    }

    //Deleting a service by their id
    @DeleteMapping("/delete/{serviceId}")
    public List<Service> deletebyServiceId(@PathVariable int serviceid){
        serviceserv.deleteServicebyId(serviceid);
        return serviceserv.getAllServices();
    }
}
*/
