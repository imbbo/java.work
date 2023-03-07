package oop.chap2.quiz01;

public class Employee extends Person {

	String departments;
	
	Employee(String name, int age) {
		this.departments = "인사담당부";
		this.name = name;
		this.age = age;
	}
	void comInfo() {
		super.comInfo();
		System.out.print("부서: " + departments);
	}
	
}
