/* 
 * Difference between static and non-static variables (Assignment 2, Problem 4)
 * --------------------------------------------------------------------------------
 */
public class CounterDemo {
	
	public static void main(String[] args) {
		
		new SCounter();
		new SCounter();
		new SCounter();
		
		new NSCounter();
		new NSCounter();
		new NSCounter();
	}
	
}

class SCounter {

	static int count = 1;

	{
		System.out.println("In SCounter Static Block | Count is "+count);
	}
	
	SCounter() {
		System.out.println("Static variable "+(count++));
	}	
}

class NSCounter {

	int count = 1;
	
	{
		System.out.println("In NSCounter Static Block | Count is "+count);
	}

	NSCounter() {
		System.out.println("Non-Static variable "+(this.count++));
	}
}
