/* A program to find sum of digits for a given number */

import java.util.InputMismatchException;
import java.util.Scanner;

class SumDigits {

	long num;
	
	SumDigits(long num) {
		this.num = num;
	}
	
	public long sum(long num) {
		long sum = 0;
		while (num % 10 != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}
	
}

public class SumDigitsDemo extends SumDigits {
	
	SumDigitsDemo(long num) {
		super(num);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		long num = 0;
		
		try {
			num = sc.nextLong();
		} catch (InputMismatchException e) {
			System.out.println("Number too large. Please enter a smaller number");
		} 
		
		sc.close();
		
		SumDigitsDemo s = new SumDigitsDemo(num);
		System.out.println("Sum of digits of "+num+" is "+s.sum(num));
		
	}
}

//TODO define an interface to access the sum method.
//TODO giving 1234567890 as input returns wrong result. Throw exception and handle it.