package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하세요)

		int i = 48;

		while(i <= 150) {
			if(i % 8 == 0) {
				System.out.print(" " + i);
			}
			i++;	
		}

		System.out.println();
		System.out.println("-----------------------------------------");

		// 1 ~ 100까지의 정수 중 4의 배수이면서 
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.

		int x = 1;

		while(x <= 100) {
			if(x % 4 == 0 && x % 8 != 0) {
				System.out.print(x + " ");
			}
			x++;
		}

		System.out.println();
		System.out.println("------------------------------------------");
		// 1 ~ 30000까지의 정수 중 258의 배수를 개수를 출력

		int y = 1;
		int z = 0; // 배수의 개수를 기억해 줄 변수
		while(y <= 30000) {
			if(y % 258 == 0) {
				z++;;			
			}
			y++;	
		}
		System.out.print(z + " ");
		
		
		
		//--------------------------------------------------------------------------------
		// 1000의 약수의 개수를 구하세요.
		// 1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		// 그랬을 때 나누어 떨어지는 애가 약수입니다.
		System.out.println();
		System.out.println("------------------------------------------");



		int num1 = 1;
		int num2 = 0;
		while(num1 <= 1000) {
			if(1000 % num1 == 0) {
				num2++;
			}
			
			num1++;		
		}
			System.out.println(num2 + " ");
	}
	

}

