package com.example.task;

import java.util.ArrayList;

public class HomeModel {

    private String name;
    private String address;
    private String description;
    private String date;
    private String likes;
    private String time;
    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public HomeModel(String name, String address, String description, String date, String likes, String time, String comments) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.date = date;
        this.likes = likes;
        this.time = time;
        this.comments = comments;
    }

    private static int lastContactId = 0;

    public static ArrayList<HomeModel> createProductsList(int numContacts) {
        ArrayList<HomeModel> contacts = new ArrayList<HomeModel>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new HomeModel("Jason Roy","england","this is description","4/5/96","5","5:23pm","6" ));
        }

        return contacts;
    }

}
