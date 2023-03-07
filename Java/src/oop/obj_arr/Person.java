package oop.obj_arr;

public class Person {
// atl + shift + s -> generate getter setter 클릭하면 
// getter setter 문장 생성 가능
//	alt + shift + s -> generate construteor using field 
//	생성가능
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void personInfo() {
		System.out.printf("이름: %s\n나이: %d세\n성별: %s\n"
				, this.name, this.age, this.gender);
	}
	
	
	
}
