package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
	
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시  정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		 결과를 말씀해주세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int fir = sc.nextInt();
		System.out.println("+, -, *, / 중 골라주세요.");
		System.out.println("> ");
		String sec = sc.next();
		System.out.println("정수를 입력하세요: ");
		int thi = sc.nextInt();
		
		
		switch(sec) {
		case "+":
			System.out.println(fir + thi);
			break;
		case "-":
			System.out.println(fir - thi);
			break;
		case "*":
			System.out.println(fir * thi);
			break;
		case "/":
			if(thi == 0) {
				System.err.println("연산할 수 없는 입력값입니다.");
				break;
			}
			System.out.println(fir / thi);
			break;
			
			default:
				System.out.println("연산자를 다시 입력해주세요");
				System.out.println("+, -, *, / 중 골라주세요.");
				
//			System.out.printf("%d x %d = %d\n", fir, thi, fir*thi);
//			System.out.printf("%d / %d = %d\n", fir, thi, fir/thi);
			
		}
		sc.close();
	}

}
