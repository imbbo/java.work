package oop.abs.quiz;

public class Rect extends Shape {
	double side;
public Rect(String name, double side) {
	super(name);
	this.side = side;
}

@Override
	public double getArea() {
		return side*side;
	}
}


//pivate int side;
//
//public Circle(String name, int side) {
//	super(name);
//	this.radius = side;
//}
//public double getArea() {				// solution
//	return side*side;