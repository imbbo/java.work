package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		Person park = new Person("박영희", 45);
		Person hong = new Person("홍길동", 34);
		
		
		// 객체 타입의 변수를 출력하거나 값을 얻을 떄는
		// 뒤에 자동으로 toString()이 붙어서 진행됩니다.
		// 밑에 둘이 동일한 값이 나온다
		
		System.out.println(park.toString());
		System.out.println(hong);
		
		
		if(hong.equals(park)) {
			System.out.println(" 이름이 같습니다");
		} else {
			System.out.println(" 이름이 다릅니다");
		}
		
		// finalize는 gc가 호출되는 순서가 보장되지 않기 때문에
		// 사용이 권장되지 않습니다.
		hong = null;
		park = null;
		System.gc(); //가비지 콜렉터를 호출. (부른다고 바로 안 올수도 있습니다.
		
		
		Person Kim = new Person("김복제인간", 100);
		
		
//		try {
//			Person cloPerson = (Person) Kim.clone();
//			System.out.println("복사된 객체 정보: " + cloPerson);
//			System.out.println("Kim의 주소: " + Kim.hashCode());
//			System.out.println("복제된 객체 주소: " + cloPerson.hashCode());
//			
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
		
		
		
		
		
//		park.PersonInfo();
//		hong.PersonInfo();
		
		
	}

}
