package com.green.java.ch06;

public class Bike {
    String brand;
    String model;
    int price;

    public Bike(String brand) {
        this.brand = brand;
    }

    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(Bike bike) {
        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }

    void drive() {
        System.out.printf("%s브랜드 %s모델이 달린다.", brand, model);
    }
}
