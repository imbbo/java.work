package oop.chap2.quiz01;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age) {
		this.subject = "자바";
		this.name = name;
		this.age = age;
	}
	void comInfo() {
		super.comInfo();
		System.out.print("과목: " + subject);
	}
	
}
