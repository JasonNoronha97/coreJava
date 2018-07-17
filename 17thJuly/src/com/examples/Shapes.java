package com.examples;

public class Shapes {

	public Shapes() {

	}

	public double calculateArea(Circle c) {
		return 3.14 * c.radius * c.radius;
	}

	public double calculateArea(Square s) {
		return s.side * s.side;
	}

	public double calculateArea(Triangle t) {
		return 0.5 * t.base * t.height;
	}
}