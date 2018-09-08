import java.text.DecimalFormat;
import java.util.Scanner;

/* Generate Electricity Bill (Assignment 1, Problem 9)
 * --------------------------------------------------------------------------------
 * Java program to generate electricity bill from number of units consumed and 
 * tiered rate structure
 */

public class ElectricityBill {

	long custNo;
	String custName;
	double unitsConsumed;
	double custBill;
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	void readData () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer No: ");
		custNo = sc.nextLong();
		System.out.println("Enter Customer Name: ");
		custName = sc.next();
		System.out.println("Enter Units Consumed: ");
		unitsConsumed = sc.nextDouble();
		sc.close();
		
	}
	
	void showData () {
		
		System.out.println("Customer No: "+custNo);
		System.out.println("Customer Name: "+custName);
		System.out.println("Units Consumed: "+unitsConsumed);
		
	}
	
	double computeBill(double units) {
		
		if (units <= 100)
			custBill = 1.20 * units;
		else if (units <= 300)
			custBill = 1.20 * 100 + 2.00 * (units - 100);
		else if (units <= 600)
			custBill = 1.20 * 100 + 2.00 * 200 + 3.00 * (units  - 300);
		else if (units <= 300)
			custBill = 1.20 * 100 + 2.00 * 200 + 3.00 * 300 + 5.00 * (units - 600);
		return custBill;
	}
	
	public static void main(String[] args) {
		
		ElectricityBill e = new ElectricityBill();
		e.readData();
		e.showData();
		e.custBill = e.computeBill(e.unitsConsumed);
		System.out.println("Electricity Bill: "+df2.format(e.custBill));
		
	}
	
}
