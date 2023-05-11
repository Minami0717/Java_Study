package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private List<Card> pickCardList;

    public User() {
        pickCardList = new ArrayList<>();
    }

    public List<Card> openCards() {
        return pickCardList;
    }
    public void receiveCard(Card c) {
        pickCardList.add(c);
    }
    protected int getPointSum() {
        return Rule.getScore(pickCardList);
    }
    public void showCards() {
        for (Card c : openCards()) {
            System.out.println(c);
        }
        System.out.println();
    }
}
