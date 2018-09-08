import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
 *  ArrayList implementation from Collections (Assignment 4, Collections Problem 1)
 *  --------------------------------------------------------------------------------
 */

public class ArrayListDemo01 {

	static String Colors[] = {"Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Initializing Array List...");
		ArrayList<String> al = new ArrayList<>();
		for(String c: Colors) {
			al.add(c);
		}
		display(al);
		
		System.out.println("1. Adding Element");
		al.add(7, "Black");
		display(al);
		
		System.out.println("2. Removing Element");
		al.remove("Blue");
		display(al);
		
		System.out.println("3. Modifying Element");
		al.set(6, "Blue");
		display(al);
		
		System.out.println("4. Using Iterator");
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println("   "+i.next());
		}
		
		System.out.print("5. Viewing Particular Element - ");
		System.out.print("Enter no.: ");
		int el = sc.nextInt();
		System.out.println("   Element no. "+el+" is: "+al.get(el-1));
		
		System.out.println("6. Sorting the Array List");
		Collections.sort(al);
		display(al);
		
		sc.close();
	}
	
	static void display(ArrayList<String> arg) {
		
		System.out.println("   List: "+arg);
	}
}
