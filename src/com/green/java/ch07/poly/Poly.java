package com.green.java.ch07.poly;

public class Poly {
    public static void main(String[] args) {
        Animal ani1 = new Dog();
        ani1.crying();
        //ani1.jump();

        //Dog dog1 = new Animal();
        Dog dog1 = (Dog) ani1;
        dog1.crying();
        dog1.jump();
    }
}
