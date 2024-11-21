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

    //constructor
    public Provider(){}

    //default constructor
    public Provider(int shop, String shopname, String address, String city, String state,
                    String zip, String phonenum, int rating, float longi, float lat ){
        this.shopid = shop;
        this.shopname = shopname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenum = phonenum;
        this.rating = rating;
        this.longitude = longi;
        this.latitude = lat;
    }

    //getters and setters
    public void setShopid(int shop){this.shopid = shop;}
    public int getShopid(){ return shopid;}

    public void setShopname(String name){this.shopname = name;}
    public String getShopname() {return shopname;}

    public void setaddress(String addy){this.address = addy;}
    public String getaddy() {return address;}

    public void setcity(String city){this.city = city;}
    public String getcity() {return city;}

    public void setstate(String state){this.state= state;}
    public String getState() {return state;}

    public void setZip(String zip){this.zip = zip;}
    public String getZip() {return zip;}

    public void setPhonenum(String pho){this.phonenum = pho;}
    public String getPhonenum() {return phonenum;}

    public void setRating(int rat){this.rating=rat;}
    public int getRating(){return rating;}

    public void setLongitude(float lo){this.longitude=lo;}
    public float getLongitude(){return longitude;}

    public void setLatitude(float lat){this.latitude=lat;}
    public float getLatitude() {return latitude;}
}
