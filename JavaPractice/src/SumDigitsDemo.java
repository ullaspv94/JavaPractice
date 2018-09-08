import java.util.InputMismatchException;
import java.util.Scanner;

public class SumDigitsDemo extends SumDigits implements SumDigitsInterface {
	
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
		} finally {
			sc.close();
		}
		
		SumDigitsDemo s = new SumDigitsDemo(num);
		System.out.println("Sum of digits of "+num+" is "+s.sum(num));
		
	}
}


