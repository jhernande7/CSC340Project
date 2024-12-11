package com._Project.carServiceApp.reviews;

import jakarta.persistence.*;

@Entity
@Table(name="reviewsdb")
public class Reviews {
    @Id
    private int revid;

    private int fromid;
    private int toid;

    private String message;

    //Constructor
    public Reviews(int revid, int fromid, int toid, String text){
        this.revid = revid;
        this.fromid = fromid;
        this.toid = toid;
        this.message = text;
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

    public int getFromid() {
        return this.fromid;
    }
    public void setFromid(int id){
        this.fromid = id;
    }

    public int getToid(){
        return this.toid;
    }
    public void setToid(int id2){
        this.toid = id2;
    }

    public String getMessage(){
        return this.message;
    }
    public void setMessage(String mes){
        this.message = mes;
    }

}
