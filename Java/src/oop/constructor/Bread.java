package oop.constructor;

public class Bread {

	
		String name;
		int price;
		String ingredient;
	
		Bread(){}
		
		Bread(String pName, int pPrice, String pIngredient) {
			name = pName;
			price = pPrice;
			ingredient = pIngredient; 
		}
		void show() {
			System.out.println("빵 이름: " + name);
			System.out.println("빵 가격: " + price + "원");
			System.out.println("주 재료: " + ingredient);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
