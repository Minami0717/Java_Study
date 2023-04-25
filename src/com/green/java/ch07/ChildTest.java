package com.green.java.ch07;

public class ChildTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.play();
        child.age = 10;
        System.out.println(child.age);
        child.play();

        GrandChild gc = new GrandChild();
        gc.age = 20;
        gc.play();
    }
}
