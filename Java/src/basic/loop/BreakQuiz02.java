package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
	
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        
        ***up&down 게임***
        * 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?
        * 
        */
		
//		Scanner sc = new Scanner(System.in);
//		int rn = (int) (Math.random()*100 +1);
//		System.out.print("*** UP&DOWN 게임 ***\n");
//		int a = 6;
//		int b = 0;
//		while(true) {
//			System.out.println("\n> ");
//			int num = sc.nextInt();
//			if(num == rn) {	
//				System.out.printf("정답입니다);
//				break;
//			} else if(num < rn) {
//				System.out.printf("UP!!!\n남은 기회 %d회", a);
//				b++;
//				a--;
//			} else if(num > rn) {
//				System.out.printf("DOWN!!!\n남은 기회 %d회", a);
//				b++;
//				a--;
//			}
//		}
//			
//		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("*** UP&DOWN 게임 ***\n");
		System.out.println("1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");
		
		int secret = (int) (Math.random()*100+1);
		int count = 0;
		while(true ) {
			System.out.println("> ");
			int answer = sc.nextInt();
			count++;
			
			if(answer < 1 || answer > 100) {
				System.out.println("범위 내의 숫자를 입력하세요");
				continue;									// 여기서 continue를 걸어주면 지금을 기점으로 다시 올라간다 
			}
			
			if(answer > secret) {
				System.out.println("DOWN!!!");			
			} else if(answer < secret) {
				System.out.println("UP!!!"); 			
			} else {
				System.out.println("정답입니다!");
				break;
			}
			if(count < 7) {
				System.out.println("정답 기회" + (7-count) + "번 남음!");			
			} else {
				System.out.println("정답 기회 마저 소진!");
				System.out.println("마저 정답을 맞춰주세여");
			}
		}
		System.out.println(count + "번 만에 맞추셨네요");
		if(count <= 7) {
			System.out.println("승리했습니다");		
		} else {
			System.out.println("패배했습니다");
		}
		
		sc.close();
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	
		}
}
