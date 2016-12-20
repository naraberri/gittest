package com.javalec.children;

import com.javalec.papa.PapaPouch;

public class FirstChild {
	
	public FirstChild() {
		
	}
	
	public void takeMoney(int money){
		
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) System.out.println("첫째는 돈이 없어 못 받았아요.ㅜㅜ");
		
	}
	
}
