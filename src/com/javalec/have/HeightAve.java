package com.javalec.have;

import java.util.Scanner;

public class HeightAve {
	public static void main(String[] args) {

		String[] iArrName = { "����", "ö��", "�浿", "����", "����" };
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxIndex = 0;
		int minH = 0;
		int minIndex = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArrName[i]+"Ű�� �Է��ϼ���. :");
			iArr[i] = scanner.nextInt();
			totalHeight = totalHeight+iArr[i];
		}//for�� ����
		
		System.out.println("�л����� ��� ������" + (totalHeight/iArrName.length) + "�Դϴ� ");
		
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i] > maxH){
				maxH = iArr[i];
				maxIndex = i;
			}
		}//for�� ����
		System.out.println("���� ū �л���" + iArrName[maxIndex] + "�Դϴ�");
		
		minH = maxH;
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i] < minH){
				minH = iArr[i];
				minIndex = 1;
			}
			
		}//for�� ����
		System.out.println("���� ���� �л���" +iArrName[minIndex]+"�Դϴ�");
				
		
	}
}
