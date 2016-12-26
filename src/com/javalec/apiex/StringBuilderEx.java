package com.javalec.apiex;

public class StringBuilderEx {
	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder("abcdefg");

		stringBuilder.append("hijklmn");// 문자열 추가
		System.out.println(stringBuilder);

		stringBuilder.insert(3, "AAA");// 특정위치에 문자열 추가
		System.out.println(stringBuilder);

		stringBuilder.delete(3, 5);// 문자열 삭제
		System.out.println(stringBuilder);

		stringBuilder.deleteCharAt(10);// 특정 문자 하나 삭제
		System.out.println(stringBuilder);

	}
}
