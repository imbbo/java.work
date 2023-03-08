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
