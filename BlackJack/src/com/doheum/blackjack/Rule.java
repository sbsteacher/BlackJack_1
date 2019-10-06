package com.doheum.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Rule {
	private final int STAND_SCORE = 21;
	
	public void whoIsWin(List<Gamer> gamers) {		
		List<Gamer> targets = new ArrayList();
		List<Gamer> winners = new ArrayList();
		
		System.out.println(" <<<<<<<<<<<<<  결과 >>>>>>>");
		for(int i=0; i<gamers.size(); i++) {
			Gamer g = gamers.get(i);
			g.open();
					
			if(g.getScore() < STAND_SCORE) {
				targets.add(g);
			}
		}
		
		int maxScore = 0;
		for(Gamer g : targets) {
			if(maxScore < g.getScore()) {
				maxScore = g.getScore();
			}
		}
		
		for(Gamer g : targets) {
			if(maxScore == g.getScore()) {
				winners.add(g);				
			}			
		}
		
		String result = "승리";
		if(winners.size() > 1) {
			result = "비김";
		}
		
		for(Gamer g : winners) {
			System.out.printf("%s %s\n", g.NAME, result);
		}
		
	}
}









