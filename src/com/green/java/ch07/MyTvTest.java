package com.green.java.ch07;

public class MyTvTest {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();
        myTv.volumeUp();
        myTv.volumeUp();
        myTv.volumeUp();

        System.out.println(myTv.volume);

        MyTv2 myTv2 = new MyTv2();
        myTv2.volumeUp();
        myTv2.volumeUp();

        System.out.println(myTv2.getVolume());
    }
}
