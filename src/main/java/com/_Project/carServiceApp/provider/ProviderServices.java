package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    //getting all providers
    public List<Provider> getAllProviders() {
        return prorep.findAll();
    }

    //adding a new provider
    public void newProvider(Provider pro){
        prorep.save(pro);
    }

    //updating provider
    public void updateProvider(Integer providerid, Provider pro){
        prorep.save(pro);
    }

    //deleting by id
    public void deleteById(int Proid){
        prorep.deleteById(Proid);
    }
}
