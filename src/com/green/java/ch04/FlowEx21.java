package com.green.java.ch04;

public class FlowEx21 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == j) System.out.printf("[%d, %d]", i, j);
                else System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}
