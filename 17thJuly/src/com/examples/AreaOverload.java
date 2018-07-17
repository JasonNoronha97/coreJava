package com.examples;

public class AreaOverload {
	

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Square s1 = new Square(6);
		Triangle t1 = new Triangle(20, 20);

		Shapes sh = new Shapes();

		System.out.println("CircleArea: "+sh.calculateArea(c1));
		System.out.println("SquareArea: "+sh.calculateArea(s1));
		System.out.println("TriangleArea: "+sh.calculateArea(t1));

		
	}

}
