package com._Project.carServiceApp.customer;

import jakarta.persistence.*;

@Entity
@Table(name= "customerdb")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    private String email;
    private String reviews;
    private String password;

    // Constructor
    public Customer(int id, String name, String email, String review, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.reviews = review;
        this.password = pass;
    }

    public Customer(){}

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getReviews(){
        return this.reviews;
    }
    public void setReviews(String rev){
        this.reviews= rev;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}