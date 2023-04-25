package test;

import java.util.ArrayList;
import java.util.Random;

/*
 * 1. 카드 객체를 생성하고 모양, 숫자 변수를 선언한다.
 * 2. 변수에 값을 저장한다.
 * 3. 값은 랜덤을 이용한다.
 */

class Card {
	int num;
	int shape;
	char c;
	String result;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public char getC() {
		return c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		switch (num) {
		case 11:
			c = 'J';
			break;
		case 12:
			c = 'Q';
			break;
		case 13:
			c = 'K';
			break;
		case 14:
			c = 'A';
			break;
		default:
			break;
		}
		
		this.num = num;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
}

public class CardGame {
	
	public static void main(String[] args) {
		Random random = new Random();
		String shapes[] = {"♠","◆","♥","♣"};
		ArrayList<Card> cards = new ArrayList<Card>();
		int c = 0;
		
		System.out.print("Player : ");
		
		for (int i = 0; i < 10; i++) {
			int ranNum = random.nextInt(13)+2;
			int ranShape = random.nextInt(4);
			
			for (Card card : cards) {
				while (card.getNum() == ranNum && card.getShape() == ranShape) {
					ranNum = random.nextInt(13)+2;
					ranShape = random.nextInt(4);
				}
			}
			
			Card playerCard = new Card();
			playerCard.setNum(ranNum);
			playerCard.setShape(ranShape);
			cards.add(playerCard);
			
			if (i == 5)
				System.out.print("\nCom : ");
			
			if (cards.get(i).getNum() > 10)
				System.out.print(cards.get(i).getC()+shapes[cards.get(i).getShape()]+" ");
			else
				System.out.print(cards.get(i).getNum()+shapes[cards.get(i).getShape()]+" ");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (cards.get(i).getNum() == cards.get(j).getNum()) {
					c++;
				}
			}
		}
		System.out.println();
		System.out.println(c);
	}
}
