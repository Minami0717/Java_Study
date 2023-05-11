package com.green.java.ch07.abstract2;

public class FighterTest {
    public static void main(String[] args) {
        Fightable f1 = new Fighter();
        Fightable f2 = new Fighter2();

        f1.sum(1,4);
        f1.move(3,4);

        f2.sum(14,45);
        f2.move(32,44);
    }
}
