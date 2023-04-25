package com.green.java.ch05;

public class ArrayEx19_1 {
    public static void main(String[] args) {
        int[][] score = {
                {100,90,80},
                {20,20,20},
                {30,30,30},
                {40,40,40}
        };
        String[] sub = {"국어", "영어", "수학"};
        int[] titleSum = new int[sub.length];

        System.out.print("번호\t");
        for (int i = 0; i < sub.length; i++) {
            System.out.printf("%s\t", sub[i]);
        }
        System.out.println("총점\t평균");
        System.out.println("=========================");

        for (int i = 0; i < score.length; i++) {
            int[] eachScore = score[i];
            int sum = 0;
            System.out.printf("%2d\t", i+1);
            for (int j = 0; j < score[i].length; j++) {
                int jumsu = eachScore[j];
                System.out.printf("%3d\t", jumsu);
                sum += jumsu;
                titleSum[j] += jumsu;
            }
            System.out.printf("%3d\t%.1f\n", sum, (double)sum / score[i].length);
        }

        System.out.println("=========================");
        System.out.println("총점");
        for (int i = 0; i < sub.length; i++) {
            System.out.printf("%s: %d\n",sub[i], titleSum[i]);
        }
    }
}
