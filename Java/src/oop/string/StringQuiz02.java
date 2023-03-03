package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포합해서 받습니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);

		//		while(true) {
		//			System.out.println("주민등록번호 13자리를 입력해주세요(-포함): ");
		//			String num = sc.next();
		//			num = String.valueOf(num);
		//			char str = num.charAt(8);
		//			if(num.length() < 14) {
		//				System.out.println("다시 입력해주세요.");			
		//			} else if(str == 1 && str == 3) {
		//				System.out.println("남자입니다.");
		//			} else if(str == 2 && str == 4) {
		//				System.out.println("여자입니다.");
		//				break;
		//			} 
		//											**** 내가 한거 ****
		//		}


		outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력하세요(-포함).");
			System.out.print("> ");
			String ssn = sc.next();

			ssn = ssn.replace("-", ""); // 바를 지워서 숫자만 냅두기

			if(ssn.length() != 13) {
				System.out.println("주민등록번호는 13자리 입니다.");
			} else {
				switch(ssn.charAt(6)) {
				case '1': case'3':
					System.out.println("남자입니다.");
					break outer;

				case '2': case '4':
					System.out.println("여자입니다");
					break outer;

				default:
					System.out.println("잘못 입력했습니다.");
				}
			}


		}









	}

}
