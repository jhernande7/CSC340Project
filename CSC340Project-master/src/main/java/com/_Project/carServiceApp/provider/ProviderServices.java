package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServices {

    @Autowired
    private ProviderRepository prorep;

    // Get Provider by ID
    public Provider getProById(Integer providerId) {
        return prorep.findById(providerId)
                .orElseThrow(() -> new RuntimeException("Provider with ID " + providerId + " not found."));
    }

    // Get all Providers
    public List<Provider> getAllProviders() {
        return prorep.findAll();
    }

    // Add a new Provider
    public void newProvider(Provider provider) {
        prorep.save(provider);
    }

    // Update Provider
    public void updateProvider(Integer providerId, Provider provider) {
        if (prorep.existsById(providerId)) {
            provider.setShopid(providerId); // Ensure the correct ID is set
            prorep.save(provider);
        } else {
            throw new RuntimeException("Provider with ID " + providerId + " does not exist.");
        }
    }

    // Delete Provider by ID
    public void deleteById(Integer providerId) {
        if (prorep.existsById(providerId)) {
            prorep.deleteById(providerId);
        } else {
            throw new RuntimeException("Provider with ID " + providerId + " does not exist.");
        }
    }
}
