package com.javalec.switchEx;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		
		/*
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int result = i % 2;
		
		switch (result) {
		case 0:
			System.out.println("�Է��Ͻ� ���ڴ� ¦�� �Դϴ�.");
			break;
		case 1:
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ�� �Դϴ�.");
			break;

		default:
			System.out.println("�𸣰ڽ��ϴ�. ����");
			break;
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int r = i % 2;
		
		switch (r) {
		case 0:
			System.out.println("¦�� �Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ�� �Դϴ�.");
			break;
			
		default:
			System.out.println("�𸣰ڽ��ϴ�.");
			break;
		}
		
	}
}
