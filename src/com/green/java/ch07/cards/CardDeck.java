package com.green.java.ch07.cards;

public class CardDeck {
    Card[] cards;
    int idx;

    public CardDeck() {
        cards = new Card[52];
        int cIdx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                String num;
                switch (j) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(j);
                }

                cards[cIdx++] = new Card(Card.KINDS[i], num);
            }
        }
    }
    public void openCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            if (i == rIdx) { continue; }
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }
    public Card pick() {
        if (idx == cards.length) {return null;}
        Card temp = cards[idx];
        cards[idx++] = null;
        return temp;
    }
}
