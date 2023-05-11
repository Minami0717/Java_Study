package com.green.java.blackjack;

import java.util.List;

public class Rule {
    private static final int BLACKJACK = 21;

    public static int getScore(List<Card> cards) {
        int score = 0;
        for (Card c : cards) {
            score += calcScore(c);
        }
        return score;
    }
    private static int calcScore(Card c)  {
        switch (c.getDenomination()) {
            case "A": return 11;
            case "K": case "Q": case "J": return 10;
            default: return Integer.parseInt(c.getDenomination());
        }
    }
    public static User whoIsWin(Gamer gamer, Dealer dealer) {
        int gScore = gamer.getPointSum();
        int dScore = dealer.getPointSum();
        String result;
        User winner = null;

        if (gScore <= BLACKJACK && (gScore > dScore || dScore > BLACKJACK)) {
            result = "Gamer Win";
            winner = gamer;
        } else if (dScore <= BLACKJACK && (dScore > gScore || gScore > BLACKJACK)) {
            result = "Dealer Win";
            winner = dealer;
        } else {
            result = "Draw";
        }

//        if (gScore > BLACKJACK) {
//            if (dScore > BLACKJACK)  {
//                result = "Draw";
//            } else {
//                result = "Dealer Win";
//            }
//        } else if (dScore > BLACKJACK) {
//            result = "Gamer Win";
//        } else {
//            if (gScore > dScore) {
//                result = "Gamer Win";
//            } else if (gScore < dScore) {
//                result = "Dealer Win";
//            } else {
//                result = "Draw";
//            }
//        }

        System.out.printf("Gamer : %d, Dealer : %d\n", gScore, dScore);
        System.out.println(result + "\n");
        return winner;
    }
}
