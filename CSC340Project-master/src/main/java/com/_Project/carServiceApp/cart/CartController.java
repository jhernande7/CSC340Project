package com._Project.carServiceApp.cart;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServices cartserv;

    //get everything in cart
    @GetMapping("/all")
    public List<Cart> getAllCart(){
        return cartserv.getAllCarts();
    }

    //get by cart id
    @GetMapping("/{cartid}")
    public Optional<Cart> getCartById(@PathVariable int cartid){
        return cartserv.getCartById(cartid);
    }

    //adding a new cart
    @PostMapping("/new")
    public List<Cart> newCart(@RequestBody Cart cart){
        cartserv.newCart(cart);
        return cartserv.getAllCarts();
    }

    //updating current cart
    @PutMapping("/update/{cartid}")
    public Optional<Cart> updateCart(@PathVariable int cartid, @RequestBody Cart cart){
        cartserv.updateCart(cartid,cart);
        return cartserv.getCartById(cartid);
    }

    //deleting by id
    @DeleteMapping("/delete/{cartid}")
    public List<Cart> deleteByCartId(@PathVariable int cartid){
        cartserv.deleteCartById(cartid);
        return cartserv.getAllCarts();
    }

}
