package oop.abs.pet;

public class Dog extends Pet {

	
	
	public Dog(String name, String kind, int age) {
		super(name, kind, age);
	}

	@Override
	public void feed() {
		System.out.println("강아지는 사료를 먹습니다");
	}

	@Override
	public void takeNap() {
		System.out.println("강아지는 마당에서 낮잠을 잡니다.");
	}

}
