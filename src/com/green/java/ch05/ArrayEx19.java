package com.green.java.ch05;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100,90,80},
                {20,20,20},
                {30,30,30},
                {40,40,40}
        };
        int sum = 0;
        int[] sum1 = new int[score[0].length];
        int[] sum2 = new int[score.length];
        String[] sub = {"국어", "영어", "수학"};

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("=========================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%2d\t", i+1);
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%3d\t", score[i][j]);
                sum += score[i][j];
            }
            System.out.printf("%3d\t%.1f\n", sum, (double)sum / score[i].length);
            sum = 0;
        }

        System.out.println("=========================");
        System.out.println("총점");
        for (int i = 0; i < score[i].length; i++) {
            for (int j = 0; j < score.length; j++) {
                sum += score[j][i];
            }
            System.out.printf("%s: %d\n",sub[i], sum);
            sum = 0;
        }
    }
}
