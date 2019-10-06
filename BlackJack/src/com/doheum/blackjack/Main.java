package com.doheum.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		CardDeck cd = new CardDeck();
		
		List<Gamer> gamers = new ArrayList();
		gamers.add(new Gamer("게이머1"));
		gamers.add(new Gamer("게이머2"));
		gamers.add(new Gamer("게이머3"));
		Dealer dealer = new Dealer();
		Rule rule = new Rule();
		Scanner scan = new Scanner(System.in);
				
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.pick());
			for(Gamer gamer : gamers) {
				gamer.receiveCard(cd.pick());
			}
		}		
		dealer.moreCard(cd);
				
		int cntStop = 0;
		while(cntStop < gamers.size()) {
			for(Gamer gamer : gamers) {
				if(gamer.getIsMoreCard()) {
					gamer.open();
					System.out.printf("%s 카드를 더 받으시겠습니까?(No:0) ", gamer.NAME);
					int selectedValue = scan.nextInt();
					
					if(selectedValue == 0) {	
						cntStop++;
						gamer.setIsMoreCard(false);
						continue;
					}
					
					gamer.receiveCard(cd.pick());
					
				}
			}			
		}
		scan.close();
		
		gamers.add(dealer);
		rule.whoIsWin(gamers);
	}
}












