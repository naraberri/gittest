package com.javalec.abstractex;

public abstract class HeadQuarterStore {
	public HeadQuarterStore() {
		
	}
	
	public void method1() {
		
		System.out.println();
	}
	
	//나는 선언만 할테니 상속받고있는 자식클래스가 구현한다.
	public abstract void orderKimChijjige();
	
	public abstract void orderBuDaejjige();
	
	public abstract void orderBiBimbap();
	
	public abstract void orderSunDaeguk();
	
	public abstract void orderGongGibap();
}
