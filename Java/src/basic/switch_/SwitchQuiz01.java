package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요.\n ");
		int first =sc.nextInt();
		
		System.out.println("\n연산자를 아래 중에 하나로 적어주세요.");
		String cal = sc.next();
		
		System.out.println("\n두 번째 정수를 입력해주세요.\n ");
		int second = sc.nextInt();
		
		System.out.println("-----------------------------------------------");
		
		int result = 0;
		boolean flag = false;
		
		switch(cal) {
		
		case "+":
		result = first + second;
		break;
		
		case "-":
		result = first - second;
		break;
		
		case "*":
		result = first * second;
		break;
		
		case "/":
			if(second == 0) {
				System.out.println("연산할 수 없는 입력값입니다. ");
				flag = true;
				break;
			}
		result = first / second;
		break;
		
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
			flag = true;
			break;
		}
		if (!flag) {
			System.out.printf("%d %s %d = %d\n", first, cal, second, result);
		}

	}

}
