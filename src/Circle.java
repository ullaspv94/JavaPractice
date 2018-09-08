import java.text.DecimalFormat;

/* Circle program to demonstrate overloaded constructors
 * --------------------------------------------------------------------------------
 * 
 */

public class Circle {

	private double radius;
	private String color;
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double r = this.getRadius();
		double area;
		area = 3.14 * r * r;
		return area;
	}
	
	public void displayCircle() {
		System.out.println("Circle Radius: "+df2.format(this.getRadius()));
		System.out.println("Circle Area: "+df2.format(this.getArea()));
		System.out.println("Circle Color: "+this.color);
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(3.0,"black");
		
		c1.displayCircle();
		c2.displayCircle();
		c3.displayCircle();
		
	}
	
}
