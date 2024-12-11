package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderServices providerService;

    // Get Provider by ID
    @GetMapping("/profile/{providerId}")
    public Optional<Provider> getProviderProfileById(@PathVariable("providerId") int id) {
        return providerService.getProById(id);
    }

    // Get all Providers
    @GetMapping("/all")
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    // Add a new Provider
    @PostMapping("/new")
    public List<Provider> newProvider(@RequestBody Provider provider) {
        providerService.newProvider(provider);
        return providerService.getAllProviders();
    }

    // Update an existing Provider
    @PutMapping("/update/{providerId}")
    public List<Provider> updateProvider(@PathVariable("providerId") int providerId, @RequestBody Provider provider) {
        providerService.updateProvider(providerId, provider);
        return providerService.getAllProviders();
    }

    // Delete a Provider by ID
    @DeleteMapping("/delete/{providerId}")
    public List<Provider> deleteByProviderId(@PathVariable("providerId") int providerId) {
        providerService.deleteById(providerId);
        return providerService.getAllProviders();
    }
}
