package com.javalec.forbreakex;

public class ForBreakEx {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i는 " + i + "입니다.");
			//continue; //밑으로 구문이 더 이상 내려갈수가없어서 오류가남
			if(i >= 3) break;
		}
		
	}
	
}
