package oop.constructor;

public class Person {

	String name;
	int age;
	int length;
	
	Person() {}
	
	Person(String bName, int bAge, int bLength) {
		name = bName;
		age = bAge;
		length = bLength;
	}
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + length + "cm");
	}
	
	
}
