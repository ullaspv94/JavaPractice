/* Write a Java program using loops to print a pyramid
 * --------------------------------------------------------------------------------
 * A simple program that prints a sideways pyramid using two loops - one nested 
 * within the other loop.
 */

public class PyramidLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++)
					System.out.print("*");
				System.out.println("");
			}
			if (i > 5) {
				for (int k = 9; k >= i; k--)
					System.out.print("*");
				System.out.println("");
			}

		}

	}

}