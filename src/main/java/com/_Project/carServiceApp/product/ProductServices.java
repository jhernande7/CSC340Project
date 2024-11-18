package com._Project.carServiceApp.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository productrepo;

    // Method to fetch product by ID
    public Optional<Product> getProductById(Integer productId){
        return productrepo.findById(productId);
    }

    //get all products
    public List<Product> getAllProducts() {
        return productrepo.findAll();
    }

    //creating a new product
    public void newProduct(Product product){
        productrepo.save(product);
    }

    //updating a current product
    public void updateProduct(Integer productId, Product product){
        productrepo.save(product);
    }

    public void deleteProductbyId(int productid){
        productrepo.deleteById(productid);
    }
}
