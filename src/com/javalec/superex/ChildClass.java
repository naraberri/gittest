package com.javalec.superex;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("ChildClass");
	}

	@Override
	public void method1() {
		super.method1();
		System.out.println("ChildClass의 method1() 입니다.");
	}

}
