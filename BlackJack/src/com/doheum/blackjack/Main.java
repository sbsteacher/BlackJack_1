package com.doheum.blackjack;

public class Main {
	public static void main(String[] args) {
		
		
		CardDeck cd = new CardDeck();
		/*
		for(int i=0; i<50; i++) {
			cd.pick();			
		}		
		cd.printCards();
		*/
		Gamer gamer = new Gamer();
			
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());
		gamer.receiveCard(cd.pick());		
		gamer.open();		
	
		Dealer dealer = new Dealer();
		
	
	}
}










