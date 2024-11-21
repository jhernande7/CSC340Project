package com._Project.carServiceApp.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServices {
    @Autowired
    private CartRepository cartrepo;

    public List<Cart> getAllCarts(){
        return cartrepo.findAll();
    }

    public Optional<Cart> getCartById(Integer cartid){
        return cartrepo.findById(cartid);
    }

    public void newCart(Cart cart){
        cartrepo.save(cart);
    }

    public void updateCart(Integer cartid, Cart cart){
        cartrepo.save(cart);
    }

    public void deleteCartById(int cartid){
        cartrepo.deleteById(cartid);
    }

}
