package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		/*
		Sonata[] sonatas = {s1, s2, s3};
		for(Sonata s : sonatas) {
			s.run();
		}
				
		Tesla[] teslas = {t1, t2, t3, t4};
		for(Tesla t : teslas) {						이 방식도 차 종류가 많아지면 힘듬
			t.run();
		}
		Porsche[] porsches = {p1, p2 ,p3};
		*/ 
		
		// 다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}
		
		System.err.println("-------------------------------------------------");
		
		System.err.println("*** 타이어 교체 잡업! ***");
		t1.frontLeft = new HTire();
		t1.frontRight = new HTire();
		t1.rearLeft = new HTire();
		t1.rearRight = new HTire();
		
		System.err.println("-------------------------------------------------");
		
		Driver Kim = new Driver();
		Kim.drive(p1);
		Kim.drive(s2);
		Kim.drive(t3);
		
		System.err.println("-------------------------------------------------");
		
		Car c = Kim.buyCar("테슬라");
		c.run();
		Tesla t5 = (Tesla) c;
		t5.enterMembership();
		System.err.println("------------------------------------------------");
		CarShop shop = new CarShop();
		shop.carPrice(s3);
		shop.carPrice(new Tesla());
		shop.carPrice(Kim.buyCar("포르쉐"));
	}
	
	
}
