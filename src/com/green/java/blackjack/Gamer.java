package com.green.java.blackjack;

public class Gamer extends User {
    static int money = 10000;
    @Override
    public void showCards() {
        System.out.println("---- Gamer ----");
        super.showCards();
        System.out.println("score: " + Rule.getScore(openCards()));
        System.out.println();
    }
}
