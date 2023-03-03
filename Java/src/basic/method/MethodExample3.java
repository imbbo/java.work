package basic.method;

import javax.annotation.processing.SupportedSourceVersion;

/*
 # 반환값, 반환 유형 (return value, return type)

 1. 반환값이란 메서드의 실행 결과값을 의미합니다.

 2. 매개변수는 여러 개 존재할 숭 ㅣㅆ지만, 반환값은 오직 한 개만 
 존재해야 합니다.

 3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
 메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.

 4. return이라는 키워드를 사용하며 return 뒤에 전달할 값을 
 지정합니다. (변수, 상수)

 5. 반환값이 잇는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 떄문에
 반환값을 다른 변수에 대입할 수도 있고, 다른 메서스드의 매개값으로도
 처리될 수 있습니다. return은 값을 나타냄과 동시에 break를 건다

 6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
 반환할 값이 딱히 없다면 return을 생략해도 됩니다.

 7. 이 떄는 반환유형을 메서드를 선언할 때 비워두지 마시고
 void라는 키워드를 작성해 주셔야 합니다.
 
 8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
 따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
 void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.
 */

public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int[] operateTotal(int n1, int n2) {
		return new int[] { n1+n2, n1-n2, n1*n2, n1/n2}; // n1+n2 부분을 위에 add에 전달이 가능하다 add(n1, n2)
	} // 메서드 내에서 메서드 언급이 가능하다
	//==============================================================================================

	//	static int calcArrayTotal(int[] num) {
	//		int total = 0;
	//		for(int i : num) {
	//			total += i;			
	//		}
	//		return total;
	//	}			***********내가 쓴거*************

	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		double avg = (double)total / nums.length;
		return new double[] { total, avg};
	}


	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
		// multi(10, 7)을 입력시 run 하면 바로 70(위의 프린트 결과값이 바로 나온다)
	}
	
	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0으로 나누지면 안됩니다.");
			return;
		}
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}



	public static void main(String[] args) {

		int r1 = add(3, 8);  // int r1 = 11; 두 코드가 같다
		int r2 = add(10, 15); // int r2 = 25; 이것도 같다
		int r3 = add(add(4,6), add(7,8)); // add(10, 15)로 위의 값과 똑같다
		System.out.println(r3);

		int[] totalResult = operateTotal(30, 6); // 6부분을 add(2, 4)도 가능하다
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		//===========================================================================	




		/*
		 1. 메서드 이름은 calcArrayTotal로 정의합니다.
		 2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
		 모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
		 리턴하는 메서드입니다.
		 3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
		 합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
		 {57, 89, 78, 91, 93, 47}
		 */
		//		int sum  = calcArrayTotal(new int[] {57, 89, 78, 91, 93, 47});
		//		System.out.println("합계는: " + sum);
		//		
		//		double avg = calcArrayTotal(new double[] {57, 89, 78, 91, 93, 47});
		//		System.out.printf("평균은: %f.2%d", avg/6);   **************내가쓴거**********

		int[] numbers = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(numbers);

		System.out.printf("합계: %d, 평균: %.2f\n"
				, (int)result[0], result[1]);


		System.out.println("=======================================");

		/*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 떄문에
		 실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도 
		 사용이 불가능합니다.
		 - 반드시 단독 호출하여 사용해야 합니다.
		 - void 메서드는 단순히 동작을 지시하는 역할을 수행합니다.
		 */
		
		
		multi(10,7);
//		int r4 = multi(10,7); x
//		System.out.println(multi(10,7)); x
		multi(add(3,4), add(4,7));
//		add(multi(4,4), multi(5,6)); x
		
		
		
		;
		
		
		
		
		
		
		

	}

}
