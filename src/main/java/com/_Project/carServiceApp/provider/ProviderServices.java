package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServices {

    @Autowired
    private ProviderRepository prorep;

    // Get Provider by ID

    public Optional<Provider> getProById(Integer providerid){
        return prorep.findById(providerid);
    }

    public List<Provider> getAllProviders() {
        return prorep.findAll();
    }

    public void newProvider(Provider provider){
        prorep.save(provider);
    }

    //updating a current customer profile
    public void updateProvider(Integer providerid, Provider provider){
        prorep.save(provider);
    }

    public void deleteById(int providerid){
        prorep.deleteById(providerid);
    }

    public void saveProvider(Provider provider){
        prorep.save(provider);
    }

}
