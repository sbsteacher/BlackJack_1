package com.doheum.blackjack;

public class Main {
	public static void main(String[] args) {
	
		CardDeck cd = new CardDeck();		
		for(int i=0; i<50; i++) {
			cd.pick();
		}		
		cd.printCards();	
	
	}
}










