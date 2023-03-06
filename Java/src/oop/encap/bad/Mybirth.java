package oop.encap.bad;

public class Mybirth {

	int year;
	int month;
	int day;
	
	void birthInfo() {
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				, year, month, day); // 앞에 this. 생략되어 있는 상태
	}
	
	
	
	
	
}
