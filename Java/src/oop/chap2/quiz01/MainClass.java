package oop.chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {


		Student stu = new Student("홍길동", 26);
		stu.comInfo();

		System.out.println();
		Teacher tea = new Teacher("박성군", 45);
		tea.comInfo();
		
		System.out.println();
		Employee emp = new Employee("한성민", 59);
		emp.comInfo();
		
		
		
		
		
	}
	
	

}
