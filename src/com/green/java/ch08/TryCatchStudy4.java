package com.green.java.ch08;

public class TryCatchStudy4 {
    public static void main(String[] args) {
        int type = 1;
        try {
            System.out.println("test");
            if (type == 0) {
                throw new Exception("고의");
            }
            else if (type == 1) {
                throw new ArithmeticException("aa");
            }
        } catch (ArithmeticException e) {
            System.out.println("arithmetic : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("owari");
    }
}
