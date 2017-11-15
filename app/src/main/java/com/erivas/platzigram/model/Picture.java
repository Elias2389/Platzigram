package com.erivas.platzigram.model;

/**
 * Created by andres on 20/10/17.
 */

public class Picture {

    private String picture;
    private String userName;
    private String time;
    private String like = "0";

    public Picture(String picture, String userName, String time, String like) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.like = like;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
