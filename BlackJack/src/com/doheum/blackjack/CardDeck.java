package com.doheum.blackjack;

public class CardDeck {
	private Card[] cardList = new Card[52];
	
	
	public CardDeck() {
		String shape = "스페이드";
		String displayValue = "";
		int calcValue = 0;
		for(int i=0; i<13; i++) {	
			switch(i) {
			case 0:
				displayValue = "A"; calcValue = 1;
				break;
			case 10:
				displayValue = "J"; calcValue = 10;
				break;
			case 11: 
				displayValue = "Q"; 	calcValue = 10;
				break;
			case 12:
				displayValue = "K"; calcValue = 10;
				break;
			default :
				displayValue = Integer.toString(i + 1);
				calcValue = i + 1;
				break;
			}			
			
			cardList[i] = new Card(shape, displayValue, calcValue);
		}		
		
		shape = "다이아몬드";
		for() {
			
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







