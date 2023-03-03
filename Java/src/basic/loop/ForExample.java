package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		//		int i = 1;
		//		int total = 0;
		//		while(i  <= 10) {
		//			total += i;
		//			i++;
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total += i;
		}

		// 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)

		for(int x=1; x<=200; x++) {
			if(x % 6 == 0 && x % 12 != 0) {
				System.out.println(" " + x);
			}
		}

		System.out.println("-----------------------------");
		
		// 1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				count++;
				System.out.println("배수의 개수: " + i);
			//입력받은 정수까지의 팩토리얼 값을 구하시오
			// 팩토리얼) 5! > 5 x 4 x 3 x 2 x 1
			
			
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 값: ");
			int x = sc.nextInt();
			int fac = 1; // 팩토리얼 최종 값을 담을 변수.
			for(int k=x; k>=1; k--) {
				fac *= i;
			}
			System.out.printf("%d!: %d\n", x, fac);
			
			sc.close();
		}

	
	
	
	
	}


}

