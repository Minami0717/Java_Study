package com.green.java.blackjack;

public class Dealer extends User {
    private final int CAN_RECEIVE_POINT = 16;

    public boolean isReceiveCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    @Override
    public void showCards() {
        System.out.println("---- Dealer ----");
        super.showCards();
    }
    public void showCardOne() {
        System.out.println("---- Dealer ----");
        System.out.println(openCards().get(0));
        System.out.println();
    }
}
