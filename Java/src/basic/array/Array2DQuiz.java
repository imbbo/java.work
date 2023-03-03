package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79, 80, 99}, // A학생
				{95, 85, 89}, // B학생
				{90, 65, 56}, // C학생
				{69, 78, 77}  // D학생
				// 과목 : 3과목
		};
		String[] stuName =  {"A학생", "B학생", "C학생", "D학생"};
		String[] subNmae = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 2. 각 과모의 평균을 출력해 보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */

		//		for(double[] avg : score) {
		//			for(double n; n<score.length; n++) {
		//				
		//			}
		//				
		//			}
		//		

		//		for(double i=0; i<score.length; i++) {
		//			for(double avg : score[0]) {
		//				avg += i;
		//				System.out.println(avg + " ");
		//			}
		//		}


		//		for(double[] sum : score) {
		//			
		//			
		//			for(double[] sum) {
		//				
		//			
		//			}
		//		}
		//		
		//		for(double[] kavg : score) {
		//			
		//		}
		// 이거는 진짜 모르겠다요 이해할떄까지 다시 보세요

		// 1, 3번 
		double totalAvg = 0.0; //학생들의 평균점수의 총합
		int idx = 0;//syuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		for(int[] stu : score) {
			int total = 0;// 여기서 선언된 이유는 밖에 선언시 학생이 바뀔떄마다 0이 안됨
			for(int s : stu) {
				total += s;
			}
			double avg = (double)total / subNmae.length;// 3.0으로 해도 상관없음
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++;
		}					

		System.out.println("------------------------------------");
		// 2번
		for(int i=0; i<subNmae.length; i++) {
			int total = 0;
			for(int j=0; j<stuName.length; j++) {
				total += score[j][i];
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s 평균점수: %.1f점\n"
					,subNmae[i], avg);
		}
		
		System.out.println("------------------------------------");
		
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균: %.1f점\n", classAvg);
		



	}



}

