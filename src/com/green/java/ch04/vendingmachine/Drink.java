package com.green.java.ch04.vendingmachine;

public class Drink {
    private String name;
    private int price;
    private String company;
    private int ml;

    Drink(String name, int price, String company, int ml) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.ml = ml;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getCompany() {
        return company;
    }
    public int getMl() {
        return ml;
    }
}
