package com.javalec.ifex;

public class IfElseEx {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int h = 30;
		int k = 30;
		
		if(i>j){
			System.out.println("i�� j����"+(i-j)+ "��ŭ �� Ů�ϴ�");
		}else{
			System.out.println("j�� i����"+(j-i)+ "��ŭ �� Ů�ϴ�");
		}
		
		if((i+j) == h){
			System.out.println("i��j�� ���� h�� �����ϴ�");
		}else{
			System.out.println("i��j�� ���� h�� ���� �ʽ��ϴ�");
		}

	}

}
