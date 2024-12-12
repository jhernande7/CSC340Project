package com._Project.carServiceApp.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderServices providerService;

    // Get Provider by ID
    @GetMapping("/profile/{shopid}")
    public String getProviderById(@PathVariable int shopid, Model model){
        Provider provider = providerService.getProById(shopid).orElseThrow(() -> new RuntimeException("Provider not found"));
        model.addAttribute("provider", provider);
        model.addAttribute("title", shopid);
        return "ProviderDashboard";
    }


    // Add a new Provider
    @GetMapping("/new")
    public String createNewProvider(Model model){
        model.addAttribute("provider", new Provider());
        return "ProviderSignup";
    }

    @PostMapping("/new")
    public String newProvider(Provider provider){
        providerService.newProvider(provider);
        return "redirect:/provider/profile/" + provider.getShopid();
    }

    // Update an existing Provider
    @GetMapping("/update/{shopid}")
    public String showUpdateForm(@PathVariable int shopid, Model model){
        Provider provider = providerService.getProById(shopid).orElseThrow(() -> new RuntimeException("Provider not found"));
        model.addAttribute("provider", provider);
        return "ProviderSignup";
    }

    @PostMapping("/update")
    public String updateProvider(Provider provider){
        providerService.saveProvider(provider);
        return "redirect:/provider/profile/" + provider.getShopid();
    }

    // Delete a Provider by ID
    @GetMapping("/delete/{shopid}")
    public String deleteByProviderId(@PathVariable int shopid){
        providerService.deleteById(shopid);
        return "redirect:/samplelogin";
    }


}
