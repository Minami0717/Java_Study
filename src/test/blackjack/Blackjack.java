package test.blackjack;

import com.green.java.ch07.cards.Card;
import com.green.java.ch07.cards.CardDeck;

import java.util.Scanner;

public class Blackjack {
    Scanner scanner = new Scanner(System.in);
    CardDeck cd;
    Player p;
    Dealer d;
    int playerSum;
    int dealerSum;
    final int BLACKJACK = 21;

    public Blackjack() {
        cd = new CardDeck();
        p = new Player();
        d = new Dealer();
        game();
    }

    void game() {
        betting();
        cd.shuffle();
        startCard();
        printCard();
        while (playerSum < BLACKJACK) {
            choice();
        }
        if (playerSum == BLACKJACK) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
    void betting() {
        printMoney();
        System.out.print("베팅금 : ");
        int betMoney = scanner.nextInt();
        p.setMoney(p.getMoney() - betMoney);
        printMoney();
    }
    void startCard() {
        for (int i = 0; i < 2; i++) {
            pickCard(p);
            pickCard(d);
        }
    }
    void pickCard(Gamer g) {
        Card card = cd.pick();
        g.pickCards.add(card);
        if (g instanceof Player) {
            playerSum += strToNum(card.num);
        }
    }
    void printMoney() {
        System.out.println("소지금 : " + p.getMoney());
    }
    int strToNum(String str) {
        int num = 0;
        switch (str) {
            case "A":
                num = 11;
                break;
            case "K": case "Q": case "J":
                num = 10;
                break;
            default:
                num = Integer.parseInt(str);
        }
        return num;
    }
    void printCard() {
        System.out.println("\nPlayer");
        for (Card c : p.pickCards) {
            System.out.printf("%s %s\t", c.kind, c.num);
        }
        System.out.println("sum: " + playerSum);

        System.out.println("\nDealer");
        System.out.printf("%s %s\t", d.pickCards.get(0).kind, d.pickCards.get(0).num);
        System.out.println();
    }
    void choice() {
        System.out.println("\n(1)Hit (2)Stay");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pickCard(p);
                break;
            case 2:
                while (dealerSum < 17)
                    pickCard(d);
                break;
        }
        printCard();
    }

    public static void main(String[] args) {
        new Blackjack();
    }
}
