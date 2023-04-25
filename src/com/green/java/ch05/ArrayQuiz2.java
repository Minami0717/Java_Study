package com.green.java.ch05;

import java.util.Random;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        //Random random = new Random();

        int[] rNumArr = new int[6];
        for (int i = 0; i < rNumArr.length; i++) {
            rNumArr[i] = (int)(Math.random() * 45) + 1;
        }
        for (int i = 0; i < rNumArr.length; i++) {
            System.out.println(rNumArr[i]);
        }

        //System.out.println();

//        int n[] = new int[6];
//        int num = 0;
//        for(int i = 0; i<n.length; i++) {
//            do {
//                num = random.nextInt(46);
//            }while(exists(n,num));
//            n[i] = num;
//        }
//        for (int i : n) {
//            System.out.println(i);
//        }
    }
//    static boolean exists(int n[], int num) {
//        for (int i = 0; i < n.length; i++) {
//            if(n[i] == num)
//                return true;
//        }
//        return false;
//    }
}
