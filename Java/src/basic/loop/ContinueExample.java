package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {


		for(int i=1; i<=10; i++) {
			if(i == 5) continue; //continue는 건너뛰기

			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");


		for(int i=1; i<=10; i++) {
			if(i % 2 !=0) continue; // 홀수를 건너뛰기 run - 2 4 6 8 10
		}
	
	}
	
}
