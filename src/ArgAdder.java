/* Add command line arguments (Assignment 2, Question 2)
 * --------------------------------------------------------------------------------
 * Read integer arguments from command line and display their sum.
 * To enter arguments while running the program in Eclipse:
 * Go to Run > Run Configurations... > Java Application > <App Name> > Arguments
 * Enter arguments to enter at launch and click on "Run"
 */

public class ArgAdder {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		// Using a for-each loop to iterate over the list of arguments
		for(String i: args) {					// arguments are read a String
			sum = sum + Integer.parseInt(i); 	// convert String args to Integer
		}
		System.out.println("Sum of Arguments: "+sum);
	}

}
