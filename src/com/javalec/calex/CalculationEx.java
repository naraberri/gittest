package com.javalec.calex;

public class CalculationEx {
	public static void main(String[] args) {

		int i = 10;
		int j = 3;
		int h = 5;

		System.out.println("=======���������=======");
		System.out.println("���� :" + (i + j)); // 13
		System.out.println("���� :" + (i - j)); // 7
		System.out.println("���� :" + (i * j)); // 30
		System.out.println("���� :" + (i / j)); // 3
		System.out.println("���� :" + (i % j)); // 1

		System.out.println("========�ڵ� ���� ������=====");
		i++; // i = i+1
		System.out.println("�߰� :" + i);
		j--; // j = j-1
		System.out.println("���� :" + j);

		System.out.println("====���� ��, ���迬���� =====");
		System.out.println("i ==j >>" + (i == j));
		System.out.println("i !=j >>" + (i != j));
		System.out.println("i > j >>" + (i > j));
		System.out.println("i > j >>" + (i < j));

		System.out.println("==========��������=======");
		System.out.println("&&(and) >>" + (i > j && i > h));
		System.out.println("&&(and) >>" + (i > j && i < h));
		System.out.println("||(or) >>" + (i > j || i < h));
		System.out.println("||(or) >>" + (i > j || i > h));
		
		System.out.println("=====���� ������========");
		int result = h !=5 ? 1:2;
		System.out.println("��󿬻� ���(result)" + result);
		
		System.out.println("=======�Ҵ� ������=======");
		System.out.println("h = " + h);
		h = 1;
		System.out.println("h = " + h);
		
		System.out.println("=======�ٿ� ���� ������=======");

		i = i+100;
		System.out.println(" i =" + i);
		i = 11;
		System.out.println(" i =" + i);		
		i += 100; // i = i+100
		System.out.println(" i =" + i);
	}

}
