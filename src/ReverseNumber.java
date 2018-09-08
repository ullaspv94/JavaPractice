/* A program to reverse the given number */

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