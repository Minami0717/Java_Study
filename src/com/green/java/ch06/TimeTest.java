package com.green.java.ch06;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1.getHour());
        t1.setHour(10);
        t1.setHour(25);
        System.out.println(t1.getHour());
    }
}
