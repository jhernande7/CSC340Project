package com._Project.carServiceApp.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @GetMapping("/{serviceid}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productServices.getProductById(id);
    }

    //gets all products
    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productServices.getAllProducts();
    }

    //adding a new product
    @PostMapping("/new")
    public List<Product> newProduct(@RequestBody Product product) {
        productServices.newProduct(product);
        return productServices.getAllProducts();
    }

    //updating a product that is in db
    @PutMapping("/update/{serviceId}")
    public List<Product> updateProduct(@PathVariable int productid, @RequestBody Product product){
        productServices.updateProduct(productid,product);
        return productServices.getAllProducts();
    }

    //Deleting a product by their id
    @DeleteMapping("/delete/{serviceId}")
    public List<Product> deletebyProductId(@PathVariable int productid){
        productServices.deleteProductbyId(productid);
        return productServices.getAllProducts();
    }
}
