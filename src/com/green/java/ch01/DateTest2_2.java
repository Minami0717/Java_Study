package com.green.java.ch01;

public class DateTest2_2 {
    public static void main(String[] args) {
        int y = 2023, m = 4, d = 27;

        String strM = (m < 10 ? "0" : "") + m;
        String strD = (d < 10 ? "0" : "") + d;
        System.out.printf("%s-%s-%s", y, strM, strD);
    }
}
