package com.javalec.abstractex;

public class StoreNum1 extends HeadQuarterStore{

	public StoreNum1() {
		
	}

	@Override
	public void orderKimChijjige() {
		
		System.out.println("4,500원 입니다.");
	}

	@Override
	public void orderBuDaejjige() {
		
		System.out.println("5,000원 입니다.");
		
	}

	@Override
	public void orderBiBimbap() {
		
		System.out.println("6,000원 입니다.");
		
	}

	@Override
	public void orderSunDaeguk() {
		
		System.out.println("5,000원 입니다.");
		
	}

	@Override
	public void orderGongGibap() {
		
		System.out.println("1,000원 입니다.");
		
	}
}
