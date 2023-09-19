package com.green.java.ioc.prev;

import com.green.java.ioc.Woofer;

public class BoWoofer implements Woofer {
    @Override
    public void sound() {
        System.out.println("B&O Woofer sound");
    }
}
