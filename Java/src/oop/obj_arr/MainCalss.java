package oop.obj_arr;

import java.util.Arrays;

public class MainCalss {

	public static void main(String[] args) {

//		Person Kim = new Person("김길동", 32, "남자");
//		Person Lee = new Person("이영희", 25, "여자");
//		Person Park = new Person("박철수", 50, "남자");
//		
//		Kim.personInfo();
//		Lee.personInfo();
//		Park.personInfo();				틀린거 아님 맞긴 함
		
//		Person[] people = new Person[3];
//		
//		people[0] = new Person("김철수", 32, "남자");
		
		Person[] people = {
				new Person("김길동", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박철수", 50, "남자")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
	
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
	}

}
