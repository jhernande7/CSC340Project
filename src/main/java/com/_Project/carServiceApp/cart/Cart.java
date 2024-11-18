package com._Project.carServiceApp.cart;

import jakarta.persistence.*;

@Entity
@Table(name="cartdb")
public class Cart{
        @Id
        private int cartid;
        @Column(nullable = false)
        private int userid;
        @Column(nullable = false)
        private int shopid;
        @Column(nullable = false)
        private int serviceid;
        private String price;
        private String serviceName;

        public Cart(){}

        public Cart(int cartid, int usid, int shopid, int serid, String price, String sername){
            this.cartid= cartid;
            this.userid= usid;
            this.shopid= shopid;
            this.serviceid = serid;
            this.price= price;
            this.serviceName= sername;
        }

        public void setCartid(int id) {
            this.cartid = id;
        }
        public int getCartid(){
            return cartid;
        }
        public void setUserid(int id){this.userid=id;}
        public int getUserid(){return userid;}

        public void setShopid(int id2){this.shopid=id2;}
        public int getShopid(){return shopid;}

        public void setServiceid(int serid){this.serviceid=serid;}
        public int getServiceid(){return serviceid;}

        public void setPrice(String price){this.price=price;}
        public String getPrice(){return price;}

        public void setServiceName(String sername){this.serviceName=sername;}
        public String getServiceName(){return serviceName;}
    }
