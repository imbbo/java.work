package etc.api.lang.obj;

public class Person implements Cloneable {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.name.equals(p.name)) {
				return true;
			}
		}
		
		return false;
	}

	
	@Override
	protected void finalize() throws Throwable {
		// 생성된 객체가 사라지는 시점에서 자동 호출 (gc가 실행될 떄)
		System.out.println(this.name + "이 소멸되었습니다.");
	}
	
//	protected object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}



	public void PersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
	}
	
	
	
	
}
