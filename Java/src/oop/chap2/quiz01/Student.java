package oop.chap2.quiz01;

public class Student extends Person {
	
	int studentId;
	
	Student(String name, int age) {
		this.studentId = 20165129;
		this.name = name;
		this.age = age;
	}
	
	void comInfo() {
		super.comInfo();
		System.out.print("학번: " + studentId);
	}
	

}
