package com.green.java.blackjack;

import java.util.Scanner;

public class Test {
    static Gamer gamer;
    static Dealer dealer;
    static Scanner scanner;
    static CardDeck cd;
    public static void main(String[] args) {
        blackjack();
    }
    static void blackjack() {
        scanner = new Scanner(System.in);
        cd = new CardDeck();
        gamer = new Gamer();
        dealer = new Dealer();

//        System.out.println("소지금 : " + gamer.getMoney());
//        System.out.print("베팅금 : ");
//        int betMoney = scanner.nextInt();
//        gamer.setMoney(gamer.getMoney() - betMoney);
//        System.out.println("소지금 : " + gamer.getMoney());

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

//        while (dealer.getScore() <= 16) {
//            dealer.receiveCard(cd.getCard());
//            dealer.setScore(rule.getScore(dealer.openCards()));
//        }

        printState();
        choice();
    }
    static void choice() {
        System.out.println("\n(1)Hit (2)Stay");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                gamer.receiveCard(cd.getCard());
                if (Rule.getScore(gamer.openCards()) > 21) {
                    printResult();
                } else {
                    printState();
                    choice();
                }
                break;
            case 2:
                printResult();
                break;
            default:
                choice();
        }
    }
    static void printState() {
        printGamerCards();
        Card dCard = dealer.openCards().get(0);
        System.out.println("\ndealer : " + dCard);
        System.out.println("\ngamerScore : " + Rule.getScore(gamer.openCards()));
    }
    static void printResult() {
        printGamerCards();
        System.out.print("\ndealer : " );
        for (Card c : dealer.openCards()) {
            System.out.print(c);
        }
        int gamerScore = Rule.getScore(gamer.openCards());
        int dealerScore = Rule.getScore(dealer.openCards());
        System.out.println("\n\ngamerScore : " + gamerScore);
        System.out.println("dealerScore : " + dealerScore);

        //System.out.println(Rule.winLose(gamerScore, dealerScore));
    }
    static void printGamerCards() {
        System.out.print("\ngamer : ");
        for (Card c : gamer.openCards()) {
            System.out.print(c.getPattern() + c.getDenomination() + " ");
        }
    }
}
