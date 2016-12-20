package com.javalec.calex;

public class CalculationEx {
	public static void main(String[] args) {

		int i = 10;
		int j = 3;
		int h = 5;

		System.out.println("=======산술연산자=======");
		System.out.println("덧셈 :" + (i + j)); // 13
		System.out.println("덧셈 :" + (i - j)); // 7
		System.out.println("덧셈 :" + (i * j)); // 30
		System.out.println("덧셈 :" + (i / j)); // 3
		System.out.println("덧셈 :" + (i % j)); // 1

		System.out.println("========자동 증감 연산자=====");
		i++; // i = i+1
		System.out.println("중가 :" + i);
		j--; // j = j-1
		System.out.println("감소 :" + j);

		System.out.println("====동등 비교, 관계연산자 =====");
		System.out.println("i ==j >>" + (i == j));
		System.out.println("i !=j >>" + (i != j));
		System.out.println("i > j >>" + (i > j));
		System.out.println("i > j >>" + (i < j));

		System.out.println("==========논리연산자=======");
		System.out.println("&&(and) >>" + (i > j && i > h));
		System.out.println("&&(and) >>" + (i > j && i < h));
		System.out.println("||(or) >>" + (i > j || i < h));
		System.out.println("||(or) >>" + (i > j || i > h));
		
		System.out.println("=====삼항 연산자========");
		int result = h !=5 ? 1:2;
		System.out.println("삼상연산 결과(result)" + result);
		
		System.out.println("=======할당 연산자=======");
		System.out.println("h = " + h);
		h = 1;
		System.out.println("h = " + h);
		
		System.out.println("=======줄여 쓰는 연산자=======");

		i = i+100;
		System.out.println(" i =" + i);
		i = 11;
		System.out.println(" i =" + i);		
		i += 100; // i = i+100
		System.out.println(" i =" + i);
	}

}