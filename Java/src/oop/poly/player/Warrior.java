package oop.poly.player;


public class Warrior extends Player {

	int rage;
	Warrior(String name) {

		super(name);		
		this.rage = 60;
	}
	
	public void rush(Player p) {
		
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들 입니다. 
		 
		 - rush의 대상이 전사라면 10의 피해를 받고
		 마법사라면 20의 피해를 받고, 사냥꾼이면 15의 피해를 받는다
		 
		 = 서로 다른 데미지를 intanceof를 사용하여 구분해서 적용해 주세요
		 
		 - 남은 체력도 출력해주세요
		 
		 - main에 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
		 */
		
		System.out.printf("%s님이 %s님에게 돌진을 했습니다\n"
				, this.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Hunter) {
			p.hp -=15;
			System.out.printf("%s(헌터)님이 15의 피해를 입었습니다.\n"
					, p.name);
		}
		
		System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
		System.err.println("--------------------------------");
		
	}
	
	
	
	
	
	@Override 
	void characterInfo() {
		super.characterInfo();
		System.out.println("#분노: " + rage);
	}
	
	
	
	
	
	
	
	
	
}
