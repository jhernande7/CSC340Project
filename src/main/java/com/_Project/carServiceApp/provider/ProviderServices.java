package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProviderServices {
    @Autowired
    //provider repository object used to call back for custom requests and also used for regular requests.
    private ProviderRepository prorep;

    //getting provider by their id
    public Optional<Provider> getProById(Integer proid){
        return prorep.findById(proid);
    }
}
