package com.green.java.ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();

        for (int i = 0; i < 10; i++) {
            tv.channelUp();
        }
        System.out.printf("channel : %d\n", tv.channel);

        for (int i = 0; i < 10; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d\n", tv.channel);
    }
}
class Tv2 {
    String color;
    boolean power;
    int channel;
    final int MAX_CHANNEL = 5;
    final int MIN_CHANNEL = 1;

    void power() { power = !power; }
    void channelUp() {
        if (channel < MAX_CHANNEL) {
            ++channel;
        }
    }
    void channelDown() {
        if (channel > MIN_CHANNEL) {
            --channel;
        }
    }
}
