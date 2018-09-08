import java.util.Scanner;

/* Return prime numbers up to a given number (Assignment 1, Problem 4)
 * -------------------------------------------------------------------------------- 
 * This program uses a for loop to cycle through all numbers below the given number
 * and uses a method to check if the current number is a prime. If yes the number 
 * is printed else the next number is evaluated.
 */

public class PrintPrimes {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num < 2) System.out.println("There are no primes below " +num);
		
		System.out.print("Primes upto "+num+" are: ");
		for (int i = 2; i < num; i++) {
			if (isPrime(i) == true)
				System.out.print(i + " ");
		}
		
	}

	static Boolean isPrime(int n) {
		
		Boolean flag = true;
		
		for (int j = 2; j < n; j++) { 
			if (n % j == 0) 
				flag = false;
		}
		return flag;
	}
	
}
