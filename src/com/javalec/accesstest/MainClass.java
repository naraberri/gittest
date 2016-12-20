package com.javalec.accesstest;

public class MainClass {
	public static void main(String[] args) {
		AccessTest accesstest= new AccessTest();
		
		//at.a; priavate때문에 접근이 안됨
		
		accesstest.meth();
		
		

	}
}
