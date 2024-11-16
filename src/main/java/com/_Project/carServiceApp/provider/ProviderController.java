package com._Project.carServiceApp.provider;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderServices providerService;

    @GetMapping("/{providerid")
    public Optional<Provider> getprovider(@PathVariable int id){
        return providerService.getProById(id);
    }
}
