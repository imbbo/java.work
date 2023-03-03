package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 #국어, 영어, 수학 점수를 각각 입력받아서
		 평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 > A+
		 94 ~ 90 > A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는 
		 모두 F 처리하면 됩니다.(100점 만점)
		 EX)
		 평균 점수 : 95.5
		 당신의 학점은 A+ 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int num1 = sc.nextInt();
		System.out.print("영어: ");
		int num2 = sc.nextInt();
		System.out.print("수학: ");
		int num3 = sc.nextInt();
		
		System.out.println("--------------------------------");
		
		double ave = (num1 + num2 + num3) / 3;
		String grade = "";
		
		if(ave >= 90) {
			if(ave >= 95 && ave <= 100) {
				grade = "A+";
			} else if(ave >= 90 && ave <=94) {
				grade = "A0";
			}
		} else if(ave <= 89 && ave >= 80) {
			grade = "B";
		} else if(ave <= 79 && ave >= 70) {
			grade = "C";
		} else if(ave <= 69 && ave >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("평균 점수는: " + ave);
		System.out.println("당신의 학점은: " + grade);

		sc.close();
	}

}
