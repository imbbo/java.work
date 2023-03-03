package basic.array;

import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 러시안 룰렛==========");
		int count = 0;
		// 게임 인원 입력
		System.out.println("게임 플레이어 인원을 설정해주세요.");
		int num = sc.nextInt();
		String[] player = new String[3];
		
		
		while(true) {
			
			for(int i=0; i<count; i++) {
				
				System.out.print("이름을 입력해주세요: ");
				player[count] = sc.next();
				
				count++;
			
			break;
		}
		


		// 플레이어 이름 등록하고
		// 배열 하나 생성해서 플레이어들을 배치한다
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		
		
		// 실탄 개수 입력 (1미만 ㄴㄴ 5초과 ㄴㄴ)
		System.out.print("실탄 개수를 설정 해주세요: ");
		int tan = sc.nextInt();
		
		if(tan > 1 && tan < 6) {
			System.out.printf("실탄 개수 설정 완료 - %d발",tan);
		} else {
			System.out.println("실탄 개수는 1이상 5이하로 설정 해주세요");
		}
		// 실탄을 탄창에 배치한다
		boolean[] bulletPos = new boolean[6];
		
//		while(true) {
//			boolean flag = false;
//			
//		} for(int i=0; i<bulletPos.length; i++) {
//				if(i == 0)
//					
//									
//			
//		}
		// 난수를 생성하셔서 실탄을 탄창에 배치합니다.
		// flase -> true로 바꾸는 것이 실탄 장전입니다.
		// 난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		// 같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		
				
		// 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 신덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없음
		
		
		// 일부로 입력 대기를 해서 흐음을 잠시 끊어줍니다.
		// 이 이름값(enter)는 받아서 활용할 것이 아니기 떄문에
		// 따로 변수를 선언하지 않습니다.
//		sc.nextLine();
		
		
		// 최후의 1인이 남을 때 까지 게임을 진행해 주세요
		// 또는 총알을 다 소비할 떄 까지 게임을 진행합니다
		// 총알을 소모하면 true값을 false로 변경해주세요
		// 사람이 한 명 아웃되면 배병ㄹ의 크기를 줄여주세요
		
		
		
	}

	}
}
