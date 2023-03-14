package etc.api.utill.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		System.out.println("-------------------------------------------");
		
		// 현재 날짜 정보 얻기(연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// 현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		// 현재 날짜와 시간 정보 얻기 (연, 월, 일, 시 ,분 ,초)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		// 특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate
					= LocalDateTime.of(2022, 7, 1, 9, 0, 0);
		System.out.println("beginDate: " + beginDate);
		
		// 연도 추출
		int year = localDateTime.getYear();
		System.out.println("year: " + year);
		
		int monthValue = localDateTime.getMonthValue();
		System.out.println("monthValue: " + monthValue);
		
		Month month = localDateTime.getMonth();
		System.out.println("month: " + month);
		
		System.out.println("--------------------------------------");
		
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);
		
		// 지금으로부터 1년 2개월 7일뒤
		LocalDateTime d1 = localDateTime
							.plusYears(1)
							.plusMonths(2)
							.plusDays(7);
		System.out.println(d1);
		
		// 사이 날짜 연산
		LocalDate b = LocalDate.of(2017, 8, 7);
		
		LocalDate f = LocalDate.of(2019, 4, 20);
		
		long between = ChronoUnit.DAYS.between(b, f);
		System.out.println("between:" + between);
		
		System.out.println("----------------------------");
		//날짜 포맷 변경하기
		
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy년 M월 dd일 E요일 a hh시 mm분 ss초");
		
		System.out.println(localDateTime.format(dtf));
		
	}

}
