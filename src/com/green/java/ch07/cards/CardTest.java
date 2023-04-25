package com.green.java.ch07.cards;

import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
//        cardDeck.openCards();
//        System.out.println("-----------");
        cardDeck.shuffle();
        cardDeck.openCards();
        System.out.println("-----------");

        Card c1 = cardDeck.pick();
        System.out.println(c1.kind + ", " + c1.num);

        Card c2 = cardDeck.pick();
        System.out.println(c2.kind + ", " + c2.num);

        System.out.println("-----------");
        cardDeck.openCards();
    }
}