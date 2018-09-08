package src;
import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();
		
		/* Using modulo arithmetic */
		long sum = 0;
		while (num % 10 != 0) {
			sum = sum * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("Reverse of number using Modulo Arithmetic is "+sum);
		
		/* Using StringBuffer and reverse() method */
		StringBuffer s = new StringBuffer(Long.toString(num));
		s.reverse();
		System.out.println("Reverse of number using String Reversal is "+s);
		
		
	}

}