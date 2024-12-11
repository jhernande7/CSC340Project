package com._Project.carServiceApp.provider;

import jakarta.persistence.*;

@Entity
@Table(name ="providersdb")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shopid;

    @Column(nullable = false)
    private String shopname;

    private String phonenum;

    private String reviews;
    //constructor
    public Provider(){}

    //default constructor
    public Provider(int shop, String shopname,String phonenum, String reviews){
        this.shopid = shop;
        this.shopname = shopname;
        this.phonenum = phonenum;
        this.reviews = reviews;
    }

    //getters and setters
    public void setShopid(int shop){this.shopid = shop;}
    public int getShopid(){ return shopid;}

    public void setShopname(String name){this.shopname = name;}
    public String getShopname() {return shopname;}

    public void setPhonenum(String pho){this.phonenum = pho;}
    public String getPhonenum() {return phonenum;}

    public void setReviews(String review){this.reviews = review;}
    public String getReviews() {return reviews;}
}
