package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.age = 20;

        System.out.printf("super: %d\n", child.getSuperAge());
        System.out.printf("this: %d", child.getThisAge());
    }
}
