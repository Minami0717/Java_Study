package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(4);

        gugudan(2,8);
        gugudan(5,7);
    }
    static void gugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
    static void gugudan(int start, int end) {
        for (int i = start; i <= end; i++) {
            gugudan(i);
            System.out.println();
        }
    }
}
