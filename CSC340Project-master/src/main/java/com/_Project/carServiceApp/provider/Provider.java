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

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    private String state;
    private String zip;
    private String phonenum;
    private int rating;

    @Column(nullable = false)
    private float longitude;

    @Column(nullable = false)
    private float latitude;

    public Provider() {}

    public Provider(int shopid, String shopname, String address, String city, String state,
                    String zip, String phonenum, int rating, float longitude, float latitude) {
        this.shopid = shopid;
        this.shopname = shopname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenum = phonenum;
        this.rating = rating;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
