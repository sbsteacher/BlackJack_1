package com.doheum.blackjack;

public class Gamer {
	protected final Card[] cardList;
	public final String NAME;
	private boolean isMoreCard = true;	
	
	public Gamer(String name) {
		this(name, 49);		
	}
	
	public Gamer(String name, int size) {
		this.NAME = name;
		cardList = new Card[size];
	}	
	
	public int getScore() {
		int sum = 0;
		for(Card c : cardList) {			
			if(c != null) {				
				sum += c.getCalcValue();
			}
		}
		return sum;
	}	

	public boolean getIsMoreCard() {
		return isMoreCard;
	}

	public void setIsMoreCard(boolean isMoreCard) {
		this.isMoreCard = isMoreCard;
	}

	public void receiveCard(Card card) {
		for(int i=0; i<cardList.length; i++) {
			if(cardList[i] == null) {
				cardList[i] = card;
				return;
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
	
	public void open() {
		System.out.printf("-- %s의 점수 --\n", this.NAME);
		int sum = 0;
		for(Card c : cardList) {			
			if(c != null) {
				System.out.println(c);
				sum += c.getCalcValue();
			}
		}
		System.out.printf("sum : %d\n", sum);		
	}
}








