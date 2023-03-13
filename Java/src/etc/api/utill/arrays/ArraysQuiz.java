package etc.api.utill.arrays;

import java.awt.image.AbstractMultiResolutionImage;
import java.util.Arrays;

public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {
	
	/*
    - 참가한 사람의 이름이 담긴 배열 participant와
    완주한 사람의 이름이 담긴 배열 completion이 주어질 때
    완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
    완주하지 못한 자는 1명이라고 가정합니다.
    */
	
	Arrays.sort(participant);
	Arrays.sort(completion);
	
	for(int i=0; i<completion.length; i++) {
		if(!participant[i].equals(completion[i])) {
			return participant[i];
		}
	}
	
	return participant[participant.length-1];
	}
	
	public static void main(String[] args) {

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		
		// participant의 배열과 com 배열을 하나씩 올려 비교해서 동일하지 않은 배열의 자리를 출력할 예정
		// com에 part를 하나씩 올려서 비교, 남은 한명은 false, false가 나온 배열을 출력
		
		System.out.println("완주하지 못한자: " + solution(participant, completion));
		
		
	}

}
