import java.util.Stack;

/*
 * Stack Demo (Assignment 4, Problem 3)
 * --------------------------------------------------------------------------------
 */

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		System.out.println("Pushing 5 items into stack");
		stk.push("one");
		stk.push("two");
		stk.push("three");
		stk.push("four");
		stk.push("five");
		System.out.println(stk);
		
		System.out.println("Popping 1 item from stack");
		stk.pop();
		System.out.println(stk);
		
		System.out.println("Displaying items in stack using for-each");
		for(String o: stk) {
			System.out.println(o);
		}
		
		
	}
	
}
