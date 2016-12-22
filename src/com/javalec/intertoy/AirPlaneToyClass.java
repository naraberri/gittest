package com.javalec.intertoy;

public class AirPlaneToyClass implements Missile, Light {

	public AirPlaneToyClass() {
		
		System.out.println("비행기 입니다.");
		canLight();
		canMissile();
		System.out.println("==============================");
	}
	
	@Override
	public void canLight() {
		
		System.out.println("불빛 발사 가능 합니다.");
	}

	@Override
	public void canMissile() {
		
		System.out.println("미사일을 발사 할 수 있습니다.");
	}

}
