package com.green.java.ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = 10 + i;
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
        System.out.println(tvArr[2].channel);
    }
}
