import java.util.Scanner;

/* Example with a class
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
	
	void getData () {
		
		Scanner sc = new Scanner(System.in);
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
		sc.close();
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
