import java.util.Scanner;

/* Example with a class (Assignment 1, Problem 8)
 * --------------------------------------------------------------------------------
 * Create a class Employee with data members empNo, empName, empDesignation, 
 * empDept and salary,date of joining and methods as getData() (to set the values 
 * to data members) and displayData() (to display data members values to the screen)
 * create an employee instance and display its information.
 */

public class Employee {

	int empNo;
	String empFname;
	String empLname;
	String empDesg;
	String empDept;
	long empSal;
	Scanner sc = new Scanner(System.in);
	
	// Added constructor similar to getData() method to use for Assignment 2, Problem 5
	Employee() {
		this.getData();
	}
	
	void getData () {
		
		System.out.println("Taking data for "+this.getClass());
		System.out.println("Enter Employee No: ");
		empNo = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		empFname = sc.next();
		empLname = sc.next();
		System.out.println("Enter Employee Designation: ");
		empDesg = sc.next();
		System.out.println("Enter Employee Department: ");
		empDept = sc.next();
		System.out.println("Enter Employee Salary: ");
		empSal = sc.nextLong();
	}
	
	void displayData() {
		System.out.println("Employee No: "+empNo);
		System.out.println("Employee Name: "+empFname+" "+empLname);
		System.out.println("Employee Designation: "+empDesg);
		System.out.println("Employee Department: "+empDept);
		System.out.println("Employee Salary: Rs. "+empSal);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.getData();
		e.displayData();
	}
}
