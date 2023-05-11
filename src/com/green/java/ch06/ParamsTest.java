package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;

        NumberBox nb = new NumberBox();
        nb.num = 10;

        NumberBox nb3 = new NumberBox();
        NumberBox nb4 = changeNum1(nb3);

        System.out.println(nb3.num);
        System.out.println(nb4.num);
    }
    static void changeNum(int num) {
        num = 20;
    }
    static void changeNum(NumberBox nb2) {
        nb2.num = 20;
    }
    static NumberBox changeNum1(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 20;
        return nb2;
    }
}
class NumberBox {
    int num;
}