package com._Project.carServiceApp.provider;

import jakarta.persistence.*;

@Entity
@Table(name = "providersdb")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shopid;

    @Column(nullable = false)
    private String shopname;

    private String phonenum;
    private String email;

    private String reviews;
    private String password;

    //constructor
    public Provider(int shopid, String shopname,String email, String phonenum,String rev, String pass ) {
        this.shopid = shopid;
        this.shopname = shopname;
        this.email = email;
        this.phonenum = phonenum;
        this.reviews = rev;
        this.password = pass;

    }

    public Provider(){}

    public int getShopid() { return shopid; }
    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getReviews() {
        return reviews;
    }
    public void setReviews(String rev){
        this.reviews = rev;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String em){
        this.email = em;
    }
}
