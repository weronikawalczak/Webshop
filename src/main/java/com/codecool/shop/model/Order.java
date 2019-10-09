package com.codecool.shop.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    Map<Product, Integer> data = new HashMap<>();
    private int id;

    public Map<Product, Integer> getData() {
        return data;
    }

    public void setData(Map<Product, Integer> data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
