package com.green.java.ioc.prev;

import com.green.java.ioc.Tv;

public class IoCTest {
    public static void main(String[] args) {
        Tv tv = new SamSungTv();
        tv.turnOn();
        System.out.println("--------------");
        tv.turnOff();
    }
}
