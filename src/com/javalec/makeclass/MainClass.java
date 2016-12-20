package com.javalec.makeclass;

/*import com.javalec.human.WomanClass;*/

public class MainClass {
	public static void main(String[] args) {
/*
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));//같은 클래스에서 만들어졌지만 독립된 객체이기때문에 false가 나온다
*/
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15,160,50,"010-0000-0000");
		
		mc.getAge();
		mc.setAge(16);
		
		double d = mc.calculateBMI();
		
	}

}
