/* 
 * Calculate area and sum using Overloaded Methods (Assignment 2, Question 3)
 * --------------------------------------------------------------------------------
 * Use overloaded methods to calculate area of rectangle or triangle depending upon
 * parameters passed to the method.
 */

public class MethodOverload {

	int length, breadth, side;
	int x, y;
	double a, b;
	
	void area(int side) {
		System.out.println("Shape is a square");
		System.out.println("Length of a side is "+side);
		System.out.println("Area of the square is " +(float)(side * side));
	}
	
	void area(int length, int breadth) {
		System.out.println("Shape is a rectangle");
		System.out.println("Length is "+length+" and breadth is "+breadth);
		System.out.println("Area of the rectangle is " +(float)(length * breadth));
	}
		
	void sum(int x, int y) {
		System.out.println("Sum of two Integers "+x+" and "+y+" is "+(x+y));
	}
	
	void sum(double a, double b) {
		System.out.println("Sum of two Double Floats "+a+" and "+b+" is "+(a+b));
	}
	
	
	public static void main(String[] args) {
		
		MethodOverload m1 = new MethodOverload();
		m1.area(5);
		MethodOverload m2 = new MethodOverload();
		m2.area(4, 3);
		MethodOverload m3 = new MethodOverload();
		m3.sum(12, 13);
		MethodOverload m4 = new MethodOverload();
		m4.sum(12.0, 13.0);
		
	}
	
}