package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = { "♠","♦","♥","♣" };
    public static final int CARD_COUNT = 13;
    private List<Card> cardList;

    public CardDeck() {
        cardList = new ArrayList<>();
        for (String pattern : PATTERNS) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                cardList.add(new Card(pattern, getDenomination(j)));
            }
        }
    }
    private String getDenomination(int num) {
        switch (num) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(num);
        }
    }
    private int getRandomIdx() {
        return (int)(Math.random() * cardList.size());
    }
    public Card getCard() {
        return cardList.remove(getRandomIdx());
    }
    public int cardSize() {
        return cardList.size();
    }
    public void showSize() {
        System.out.println(cardList.size());
    }
}
