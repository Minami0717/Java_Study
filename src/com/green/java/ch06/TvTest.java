package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.printf("power : %b\n", tv.power);
        System.out.printf("channel : %d\n", tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n", tv.power);

        tv.power();
        System.out.printf("power : %b\n", tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);

        tv.channel = 10;
        System.out.printf("channel : %d\n", tv.channel);
    }
}
