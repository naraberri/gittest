package com.javalec.ave;

import java.util.Scanner;

public class AverageClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ������ �Է� �ϼ���. ");
		int kor = scanner.nextInt();		// ���� ����
		System.out.print("���� ������ �Է� �ϼ���. ");
		int eng = scanner.nextInt();		// ���� ����
		System.out.print("���� ������ �Է� �ϼ���. ");
		int met = scanner.nextInt();		// ���� ����
		
		double ave = (kor + eng + met) / 3;
		
		System.out.println("��� ������ " + ave + "�Դϴ�.");
		
		if(kor > ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else if (kor < ave){
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		
		if(eng > ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else if (eng < ave){
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		
		if(met > ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else if (met < ave){
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		
	}
}
