package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {


		String[] foods = {"삼겹살", "졸발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		// 배열의 인덱스 탐색
		// - 입력을 받았는데 이미 배열에 존재하는 음식이라면
		// '이미 존재하는 음식입니다.' 를 출력하고
		// 다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
		System.out.println("-------------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();


		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {				
				System.out.println("이미 존재하는 음식입니다.");
				System.out.println("다시 입력해주세요.");
				String name1 = sc.next();
			} else if(i == foods.length-1) {
				System.out.println("없는 음식입니다");	
				break;
			} 

		}

		sc.close();

	
	
	
	
	
	}





}

