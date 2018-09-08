
/*
 * Abstract Class & Abstract Method example (Assignment 3, Problem 3)
 * --------------------------------------------------------------------------------
 *   (1) Creating a reference variable of an abstract class.
 *   (2) Assigning subclass object to it.
 *   (3) Printing corresponding area.
 * 
 */

public class ShapeArea {

	public static void main(String[] args) {
		
		Figure f1, f2;
		
		f1 = new Rectangle();
		f2 = new Triangle();
		
		f1.area(5, 10);
		f2.area(5, 10);
		
	}
}

abstract class Figure {
	
	float dim1, dim2, area;
	abstract void area(float dim1, float dim2);
	
}

class Rectangle extends Figure {

	void area(float dim1, float dim2) {
		area = dim1 * dim2;
		System.out.println("Area of Rectangle is "+area);
	}
	
}

class Triangle extends Figure {

	void area(float dim1, float dim2) {
		area = (float) ((1.0 / 2.0) * dim1 * dim2);
		System.out.println("Area of Triangle is "+area);
	}
	
}