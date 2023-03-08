package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {

		Person Kim = new Person("김철수");
//		Kim.nation = "미국"; // x nation의 값을 대한민국을 final로 선언해서
//		Kim.name = "김마이클"; x 
		Kim.age = 30;
		
		Person park = new Person("박영희");
//		park.name = "영국"; x 
//		park.name = "박영국"; x
		
		System.out.println(Kim.name);
		
	}

}
