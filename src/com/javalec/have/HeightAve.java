package com.javalec.have;

import java.util.Scanner;

public class HeightAve {
	public static void main(String[] args) {

		String[] iArrName = { "영희", "철수", "길동", "영수", "말자" };
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxIndex = 0;
		int minH = 0;
		int minIndex = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArrName[i]+"키를 입력하세요. :");
			iArr[i] = scanner.nextInt();
			totalHeight = totalHeight+iArr[i];
		}//for문 종료
		
		System.out.println("학색들의 평균 신장은" + (totalHeight/iArrName.length) + "입니다 ");
		
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i] > maxH){
				maxH = iArr[i];
				maxIndex = i;
			}
		}//for문 종료
		System.out.println("가장 큰 학생은" + iArrName[maxIndex] + "입니다");
		
		minH = maxH;
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i] < minH){
				minH = iArr[i];
				minIndex = 1;
			}
			
		}//for문 종료
		System.out.println("가장 작은 학생은" +iArrName[minIndex]+"입니다");
				
		
	}
}