package com.javalec.forbreakex;

public class ForBreakEx {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i�� " + i + "�Դϴ�.");
			//continue; //������ ������ �� �̻� ������������� ��������
			if(i >= 3) break;
		}
		
	}
	
}
