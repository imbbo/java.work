package basic.switch_;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요. (M/F)");
		System.out.println("> ");
		String gender = sc.next();
		
		/*
		 - switch 키워드 뒤에 나오는 괄호는 boolean형 조건식이 아닌
		 변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능합니다.
		 switch에서 중괄호는 크게 열떄만 쓴다.
		 별다른 조치를 하지 않으면 값은 밑으로 계속 진행된다
		 */
		
		
		switch(gender) {
		
		
		/*
		 switch 괄호 안에 지정하신 기준값에 따라
		 만족하는 case문을 순서대로 탑색합니다.
		 적합한 case가 존재하는 경우에는 해당 case에
		 종속된 문장을 실행합니다.
		 따로 조치가 없다면 나머지 case들이 연속적으로 실행됩니다.
		 switch문은 값이 명확할떄 유리하다.
		 */
		case "ㅡ": case "m": case "M":		
			System.out.println("남자입니다.");
			break; //해당 case만 실행하고 switch문을 종료해라!
		case "ㄹ": case "f": case "F":
			System.out.println("여자입니다."); //중복 코드를  break 전에 다 넣어서 코드가 break전에 원하는 값이 나오게 하기
			break;
			
		default: //case를 설정하지 않은 값들은 모두 default로 옵니다.
			System.out.println("잘못된 입력입니다.");
		}
		
		 sc.close();

	}

}
