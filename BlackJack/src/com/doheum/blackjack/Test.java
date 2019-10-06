package com.doheum.blackjack;

public class Test {

	public static void main(String[] args) {
		String str = "안녕하세요"; //1
		
		//str += " 박도흠입니다.";
		
		str = str + " 박도흠입니다."; //2, 3
		
		System.out.println(str);

		StringBuilder sb = new StringBuilder("안녕하세요");
		sb.append(" 박도흠입니다.");
		
		System.out.println(sb);
		
	}

}
