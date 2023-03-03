package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		//1.8 곱 거기에 +32 
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도를 입력하세요(℃): ");
		double cel = sc.nextDouble();
		
		double fahr = cel * 1.8 + 32;
		
		System.out.printf("입력한 섭씨: %.1f℃\n", cel);
		System.out.printf("변환한 화씨: %.1fＦ\n", fahr);
		
		sc.close();
		
		
		

	}

}
