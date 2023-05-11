package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        OperatorEx32Quiz1 o = new OperatorEx32Quiz1();
        absX = o.getAbs(x);
        absY = o.getAbs(y);
        absZ = o.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }
    int getAbs(int num) {
        return num >= 0 ? num : -num;
    }
}