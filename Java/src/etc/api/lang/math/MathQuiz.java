package etc.api.lang.math;

public class MathQuiz {
	
	public static int page(int num) {
		return (int) Math.ceil(num / 10.0); 
			
		
	}
	
	// 나중에 게시판 만들떄 사용될 일부 로직
	
	public static void main(String[] args) {
		
		/*
		 1 ~ 10이 전달되면 1이 반환되고,
		 11 ~ 20이 전달되면 2가 반횐되고,
		 21 ~ 30이 전달되면 3이 번환되고
		 이러한 로직을 수행하는 static 메서드 page를 선언해 보세요 
		 
		 */
		
		System.out.println(page(68));
		
	}
}
