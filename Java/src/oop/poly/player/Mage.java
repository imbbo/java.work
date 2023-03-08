package oop.poly.player;

public class Mage extends Player {
	
	int mana;
	
	Mage(String name) {
		super(name);
		mana = 100;
	}
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나: " + mana);
	}

}
