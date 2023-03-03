package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
		 입력받은 수의 약수의 총합을 구하세요.
		 입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하세요: ");
		int num = sc.nextInt();
//		int div = 1;
//		int sum = 0;
//		
//		while(div > 0) {
//			if(div % num == 0) {
//				sum++;
//			}
//			div++;
//		}
//		System.out.println(sum);
		int div = 1;
		int sum = 0;
		
		while(div <= num) {
			if(num % div == 0) {
				sum += 1;
			}
			div++;
		}
		System.out.println(num + "의 약수의 총합: " + sum);
		
		sc.close();
		



	}

}
