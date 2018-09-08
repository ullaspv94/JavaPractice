import java.util.Collections;
import java.util.LinkedList;

/*
 * Demo for a single Linked List (Assignment 4, Problem 4)
 * --------------------------------------------------------------------------------
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		
		System.out.println(ll);
		
		System.out.println("1. Insert at the beginning");
		ll.addFirst("zero");
		System.out.println(ll);
		
		System.out.println("2. Insert at the 3rd position");
		ll.add(3-1, "ten");;
		System.out.println(ll);
		
		System.out.println("3. Insert after 4th node");
		ll.add(4,"noodle");
		System.out.println(ll);
		
		System.out.println("4. Delete at the beginning");
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("5. Delete at the 5th position");
		ll.remove(5-1);
		System.out.println(ll);
		
		System.out.println("6. Delete after 2nd node");
		ll.remove(2);
		System.out.println(ll);
		
		System.out.println("7. Reverse the Linked list");
		Collections.reverse(ll);
		System.out.println(ll);
		
	}
	
}
