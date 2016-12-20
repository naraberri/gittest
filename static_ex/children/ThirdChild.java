package com.javalec.children;

import com.javalec.papa.PapaPouch;

public class ThirdChild {
	
	public ThirdChild() {
		
	}
	
	public void takeMoney(int money){
		
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) System.out.println("셋째는 돈이 없어 못 받았아요.ㅜㅜ");
		
	}
	
}
