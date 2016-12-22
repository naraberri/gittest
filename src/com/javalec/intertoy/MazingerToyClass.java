package com.javalec.intertoy;

public class MazingerToyClass implements Missile, MoveArmLeg {

	
	public MazingerToyClass() {

		System.out.println("마징가 입니다.");
		canMoveArmLeg();
		canMissile();
		System.out.println("==============================");
	}
	
	@Override
	public void canMoveArmLeg() {

		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void canMissile() {
		
		System.out.println("미사일을 발사 할 수 있습니다.");

	}

}
