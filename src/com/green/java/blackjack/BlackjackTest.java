package com.green.java.blackjack;

import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            CardDeck cd = new CardDeck();
            Gamer gamer = new Gamer();
            Dealer dealer = new Dealer();

            System.out.println("\nmoney : " + Gamer.money);
            System.out.print("betMoney : ");
            int betMoney = scanner.nextInt();
            Gamer.money -= betMoney;
            System.out.println("money : " + Gamer.money);

            for (int i = 0; i < 2; i++) {
                gamer.receiveCard(cd.getCard());
                dealer.receiveCard(cd.getCard());
            }

            while (dealer.isReceiveCard()) {
                dealer.receiveCard(cd.getCard());
            }

            gamer.showCards();
            dealer.showCardOne();

            while (true) {
                System.out.print("Card More? (y/n) > ");
                String choice = scanner.next();
                if ("n".equalsIgnoreCase(choice.trim())) {
                    break;
                } else if ("y".equalsIgnoreCase(choice.trim())) {
                    gamer.receiveCard(cd.getCard());
                    gamer.showCards();
                }
            }

            dealer.showCards();

            User winner = Rule.whoIsWin(gamer, dealer);
            if (gamer.equals(winner)) { Gamer.money += betMoney * 2; }
            else if (winner == null) { Gamer.money += betMoney; }
            System.out.println("money : " + Gamer.money);

            System.out.print("\nReplay? (y/n) > ");
            String s = scanner.next();
            if ("n".equals(s)) { break; }
        }
    }
}
