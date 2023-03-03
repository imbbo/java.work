package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex) 
		 구구단을 입력하세요: 4
		 *** 구구단 4 단 ***
		 4 x 1 = 4
		 4 x 2 = 8
		 .
		 .
		 .
		 4 x 9 = 36
		 */
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요: ");
		int gu = sc.nextInt();
		System.out.println("*** 구구단 " + gu + "단 ***");
		
//		int num1 = 1;
//		int num2 = 0;
//		while(num1 <= 9) {
//			if(num2 <= 9) {
//				num2++;
//			}
//			num1++;
//		}
//		System.out.printf("%d x %d = %d", num1, num2, num1 * num2);
//		
		int num = 1;
		while(num <= 9) {
			System.out.printf("%d x %d = %d\n", gu, num, gu*num);
			num++;
		}
		sc.close();
	
		
		
		
		

	}

}
