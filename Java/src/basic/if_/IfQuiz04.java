package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		/*
		 = 정수 3개를 입력 받습니다
		 - 가장 큰 값,가장 작은 값, 중간값을 궇서 출력해보세요
		 # max, mid, min이라는 변수를 미리 선언하셔서
		 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 마지막에 한번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int fir = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int sec= sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int thi = sc.nextInt();

		int max, mid, min;

		if(fir > sec && fir > thi) {
			max = fir;
			if(sec > thi) {
				mid = sec;
				min = thi;
			} else {
				mid = thi; min = sec; 
			}
		} else if(sec > fir && sec > thi) {
			max = sec;
			if(fir > thi) {
				mid = fir; min = thi;
			} else {
				mid= thi; min = fir;
			}
		} else {
			max = thi;
			if(fir > sec) {
				mid = fir; min = sec;
			} else {
				mid = sec; min = fir;
			}
			
		}
		
		System.out.println("===========================");
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		sc.close();
	}


}


