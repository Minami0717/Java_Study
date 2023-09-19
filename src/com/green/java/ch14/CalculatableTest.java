package com.green.java.ch14;

public class CalculatableTest {
    public static void main(String[] args) {
        Calculatable c1 = new Calculatable() {
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        };

        int result = c1.calc(10, 20);
        System.out.println(result);

        Calculatable c2 = (n1, n2) -> n1 + n2;
        int result2 = c2.calc(20, 30);
        System.out.println(result2);

        Calculatable c3 = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println(c3.calc(100,200));
    }
}
