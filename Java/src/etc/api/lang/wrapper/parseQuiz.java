package etc.api.lang.wrapper;

import java.util.Scanner;

import basic.datatype.integerExample;

public class parseQuiz {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//		
		//		String i;
		//		
		//		while(true) {
		//			System.out.println("주민등록번호 입력(-포함): ");
		//			String num = sc.nextLine();			
		//		} if() {
		//			System.out.println("하이픈을 포함시켜주새요");
		//		} else if() {
		//			System.out.println("뒷자리 첫번쨰 숫자는 1, 2, 3, 4중 하나여야 한다");
		//		} else if() {
		//			System.out.println("숫자를 입력해주세요");
		//		} 
		//		

		String ssn;
		char c; // 뒷자리 첫번쨰

		while(true) {
			System.out.println("주민등록번호를 입력하세요.");
			ssn = sc.next();
			// length를 먼저 지정해주는것도 괜찮음
			if(ssn.indexOf("-") == -1) {
				System.out.println("하이픈을 포함해서 입력하세요.");
				continue;
			}
			c = ssn.charAt(7); // 이렇게 자주 부를일이 있으면 변수에 담아놓는게 편하다
			if(!(c == '1' || c == '2' || c == '3' || c == '4')) {
				System.out.println("뒷자리 첫번쨰 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}

			try {
				String test = ssn.substring(0, 6);
				String test2 = ssn.substring(7);
				Integer.parseInt(test2);
				Integer.parseInt(test2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력을 해주세요");
			}

		}

		// 921013=1234567

		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		
		String gender; int birthYear;
		
		if(c == '1' || c == '3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		if(c == '1' || c == '2') {
			birthYear = 1900 + year;
		} else {
			birthYear = 2000 + year;
		}
		
		int age = 2023 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n"
				,birthYear, month, day, age, gender);
		
		sc.close();








	}

}
