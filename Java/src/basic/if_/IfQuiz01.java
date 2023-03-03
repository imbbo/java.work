package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 키와 나이를 입력 받아서 사용자가 놀이기구에
		 탑승 살 수 있는지의 여부를 판단 하시면 됩니다.
		 키 140cm 이상, 나이가 8세 이상인 사용자만
		 놀이기구 탑승이 가능하다고 가정하고, 판단할 수 있는
		 로직을 작성해보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다
		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 하루 되세요!"
		 를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력해주세요: ");
		double len = sc.nextDouble();
		System.out.println("나이를 입력해주세요: ");
		int age = sc.nextInt();
		System.out.println("키: " + len + "나이: " + age);
		System.out.println("-----------------------------");
		
		if(len >= 140 && age >= 8) {
			System.out.println("탑승이 가능합니다.");
			
		}else {
			System.out.println("탑승이 불가능합니다.");
			
		}
		
		System.out.println("오늘 하루 즐거운 하루 되세요!");
		
	
		sc.close();
	}

}
