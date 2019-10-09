package com.codecool.shop.model;

import java.util.List;

public class User {
    int id;
    String name;
    String username;
    String email;
    Integer phoneNumber;
    Address shippingAdress;
    Address billingAdress;
    List<Order> orders;

    public User(int id, String name, String username, String email, Integer phoneNumber, Address shippingAdress, Address billingAdress, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAdress = shippingAdress;
        this.billingAdress = billingAdress;
        this.orders = orders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
