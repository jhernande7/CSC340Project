package com._Project.carServiceApp.review;

import com._Project.carServiceApp.customer.Customer;
import com._Project.carServiceApp.provider.Provider;
import jakarta.persistence.*;

import java.util.Optional;


@Entity
@Table(name="reviewsdb")
public class Reviews {
    @Id
    private int revid;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Provider provider;

    private String message;

    //Constructor
    public Reviews(int revid,String text, Customer customer, Provider provider){
        this.revid = revid;
        this.message = text;
        this.customer = customer;
        this.provider = provider;
    }
    //default constructor
    public Reviews(){}

    //getters and setters
    public int getRevid(){
        return this.revid;
    }
    public void setRevid(int id3) {
        this.revid = id3;
    }

    public String getMessage(){
        return this.message;
    }
    public void setMessage(String mes){
        this.message = mes;
    }

    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer cust){
        this.customer=cust;
    }

    public Provider getProvider(){
        return provider;
    }
    public void setProvider(Provider prov){
        this.provider = prov;
    }
}