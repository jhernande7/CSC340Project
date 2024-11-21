package com._Project.carServiceApp.provider;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderServices providerService;

    @GetMapping("/{providerid}")
    public Optional<Provider> getprovider(@PathVariable int id){
        return providerService.getProById(id);
    }

    //gets all providers
    @GetMapping("/all")
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    //for posting a new provider
    @PostMapping("/new")
    public List<Provider> newProvider(@RequestBody Provider provider){
        providerService.newProvider(provider);
        return providerService.getAllProviders();
    }

    //updating current provider
    @PutMapping("/update/{providerid}")
    public List<Provider> updateProvider(@PathVariable int providerId, @RequestBody Provider provider){
        providerService.updateProvider(providerId, provider);
        return providerService.getAllProviders();
    }

    //for deleting provider
    @DeleteMapping("/delete/{providerId}")
    public List<Provider> deleteByProviderId(@PathVariable int proid){
        providerService.deleteById(proid);
        return providerService.getAllProviders();
    }


}
