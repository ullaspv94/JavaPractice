/* A program to reverse the given number 
 * --------------------------------------------------------------------------------
 * A number is entered by the user. The number is reversed using two methods:
 * (1) using modulo arithmetic, and
 * (2) passing the number as a string to StringBuffer and reversing it using the 
 * in-built string manipulation functionality
 */

import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		long numMA = sc.nextLong();
		long numSR = numMA;
		sc.close();
		
		/* Using modulo arithmetic */
		
		long sum = 0;
		while (numMA % 10 != 0) {
			sum = sum * 10 + (numMA % 10);
			numMA = numMA / 10;
		}
		System.out.println("Reverse of number using Modulo Arithmetic is "+sum);
		
		/* Using StringBuffer and reverse() method */
		
		StringBuffer s = new StringBuffer(Long.toString(numSR));
		s.reverse();
		System.out.println("Reverse of number using String Reversal is "+s);
		
		
	}

}