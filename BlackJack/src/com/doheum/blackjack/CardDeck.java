package com.doheum.blackjack;

public class CardDeck {
	private Card[] cardList = new Card[52];	
	
	public CardDeck() {
		String[] shapes = {"스페이드", "하트", "클럽", "다이아몬드"};
		String[] displayValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		int[] calcValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		
		for(int z=0; z<shapes.length; z++) {
			for(int i=0; i<displayValues.length; i++) {
				cardList[z*13 + i] = new Card(shapes[z], displayValues[i], calcValues[i]);
			}
		}
	}
	
	public void printCards() {
		for(Card c : cardList) {
			if(c != null) {
				System.out.println(c);
			}
		}
	}
}







