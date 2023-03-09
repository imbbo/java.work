package oop.abs.quiz;

public class Circle extends Shape {

	double radius; //멤버변수

	public Circle(String name, double radius) {//매개변수 지역변수
		super(name);
		this.radius = radius;
	}
	
    
	@Override
	public double getArea() {
		return radius*radius*Math.PI;


	}
}


//	pivate int radius;
//	
//	public Circle(String name, int radius) {
//		super(name);
//		this.radius = radius;
//	}
//	public double getArea() {				// solution
//		return radius*radius*Math.PI;