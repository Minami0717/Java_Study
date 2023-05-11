package com.green.java.ch05;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[4][3];

        System.out.println(score[0][0]);
        score[2][1] = 10;

        System.out.println(score.length);
        System.out.println(score[0].length);
    }
}