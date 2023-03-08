package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

//		Singleton s = new Singleton();
//		s.method();
//		s.method2();
		
		
//		Singleton s1 = Singleton.s;
//		Singleton.s = null;
		
		Singleton s1 = Singleton.getInstance();
		s1.method();
		s1.method2();
	}

}
