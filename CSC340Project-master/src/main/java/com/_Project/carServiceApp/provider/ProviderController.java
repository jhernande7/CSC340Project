package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderServices providerService;

    // Get Provider by ID
    @GetMapping("/{providerId}")
    public ResponseEntity<Provider> getProviderById(@PathVariable Integer providerId) {
        Provider provider = providerService.getProById(providerId);
        return ResponseEntity.ok(provider);
    }

    // Get all Providers
    @GetMapping("/all")
    public ResponseEntity<List<Provider>> getAllProviders() {
        List<Provider> providers = providerService.getAllProviders();
        return ResponseEntity.ok(providers);
    }

    // Add a new Provider
    @PostMapping("/new")
    public ResponseEntity<List<Provider>> newProvider(@RequestBody Provider provider) {
        providerService.newProvider(provider);
        List<Provider> providers = providerService.getAllProviders();
        return ResponseEntity.ok(providers);
    }

    // Update an existing Provider
    @PutMapping("/update/{providerId}")
    public ResponseEntity<List<Provider>> updateProvider(
            @PathVariable Integer providerId, @RequestBody Provider provider) {
        providerService.updateProvider(providerId, provider);
        List<Provider> providers = providerService.getAllProviders();
        return ResponseEntity.ok(providers);
    }

    // Delete a Provider by ID
    @DeleteMapping("/delete/{providerId}")
    public ResponseEntity<List<Provider>> deleteProviderById(@PathVariable Integer providerId) {
        providerService.deleteById(providerId);
        List<Provider> providers = providerService.getAllProviders();
        return ResponseEntity.ok(providers);
    }
}
