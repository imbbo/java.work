package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름: ");
		String name = sc.next();
		System.out.printf("나이: ");
		int age = sc.nextInt();
		
		int born = (2023 + 1 - age);
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("출생년도: " + born + "년");
		
		sc.close();
//		System.out.println("이름: %s\n나이: %d세\n출생년도: %d년\n", name, age, 2023-age);
		
	}

}
