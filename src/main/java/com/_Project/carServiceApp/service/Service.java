/*
package com._Project.carServiceApp.service;

import jakarta.persistence.*;

@Entity
@Table(name= "serviceDb")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    @Column(nullable = false)
    private int shopId;
    @Column(nullable = false)
    private int productId;
    private String name;
    private float price;


    public Service(){} //default constructor

    public Service(int serviceid, int shopid, int productId, String name, float price){
        this.serviceId= serviceid;
        this.shopId= shopid;
        this.name = name;
        this.productId = productId;
        this.price=price;
    }

    public void setServiceId(int serviceid){ this.serviceId= serviceid;}
    public int getServiceId() { return serviceId;}

    public void setShopId(int shopId){ this.shopId= shopId;}
    public int getShopId() { return shopId;}


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setProductId(int id){
        this.productId= id;
    }
    public int getProductId(){
        return  productId;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
}
*/
