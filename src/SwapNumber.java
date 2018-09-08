/* Swap two numbers 
 * --------------------------------------------------------------------------------
 * A very simple program that takes two integers as input and swaps them. 
 */

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		long num1, num2, temp;
		
		System.out.println("Enter the first number followed by the second: ");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextLong(); 
		num2 = sc.nextLong();
		sc.close();
		
		System.out.println("You entered Num1: "+num1+", Num2: "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The swapped numbers are Num1: "+num1+", Num2: "+num2);

	}
}
