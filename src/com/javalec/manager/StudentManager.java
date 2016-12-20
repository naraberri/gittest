package com.javalec.manager;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ");
		studentManager.addStudent("ȫ���", 24, 20106428, "���а�");
		studentManager.addStudent("������", 21, 20135788, "������");
		studentManager.addStudent("��ö��", 23, 20114221, "ü����");
		studentManager.addStudent("�����", 26, 20089883, "�����");
		
		System.out.println(studentManager.students.get(0).getName());
		System.out.println(studentManager.students.get(0).getAge());
		System.out.println(studentManager.students.get(0).getStudentNum());
		System.out.println(studentManager.students.get(0).getMajor());
		
		studentManager.students.get(0).updateInfo(1, "ȫ���");
		
		System.out.println(studentManager.students.get(0).getName());
		
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " �л� ���� �Է� ����!!");
	}
}
