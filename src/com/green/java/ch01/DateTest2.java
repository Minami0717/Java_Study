package com.green.java.ch01;

public class DateTest2 {
    public static void main(String[] args) {
        int y = 2023, m = 4, d = 27;

        String strDate = y + "-" + method(m) + "-" + method(d);
        System.out.println(strDate);

        m = 12;
        d = 5;

        strDate = y + "-" + method(m) + "-" + method(d);
        System.out.println(strDate);
    }
    static String method(int n) {
        String str = String.valueOf(n);
        if (n < 10) {
            str = "0" + n;
        }
        return str;
    }
}
