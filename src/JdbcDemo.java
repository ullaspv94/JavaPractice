import java.sql.*;
import java.util.Scanner;
/*
 * Java program to show JDBC Connectivity and database operations 
 * (Assignment 5, Problem 4)
 * --------------------------------------------------------------------------------
 * Before running this program:
 *  (1) Install MySQL and MySQL Workbench (if you're not comfortable with command-line)
 *  (2) Create a new Schema named "hr"
 *  (3) Run the SQL script given in the "hr_employees.sql" file to create table and
 *      pre-populate it with dummy data.
 *  (4) Update your root password in this file
 *  
 *  Please note: This program has been tested only with MySQL. You may need to change
 *  the connection parameters snd query structure if you are are using any other 
 *  database. 
 */

public class JdbcDemo {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/hr";
	static final String USER = "root";
	static final String PASS = "P@55w0rd";
	
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	int emp_id, emp_age;
	String emp_fname, emp_sname, emp_dept, emp_desg;
	long emp_salary;
	String emp_doj;
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		// Register JDBC Driver
		Class.forName(JDBC_DRIVER);
		
		// Open a Connection
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");
		
		JdbcDemo j = new JdbcDemo();
		
		j.choice = j.showMenu();
		switch(j.choice) {
		
		case 1: // not using prepared statement
			System.out.print("Enter Emp ID: ");
			j.emp_id = j.sc.nextInt();
			System.out.print("Enter Emp Name: ");
			j.emp_fname = j.sc.next();
			j.emp_sname = j.sc.next();
			System.out.print("Enter Emp Age: ");
			j.emp_age = j.sc.nextInt();
			System.out.print("Enter Emp DoJ (yyyy-mm-dd): ");
			j.emp_doj = j.sc.next();
			System.out.print("Enter Emp Department: ");
			j.emp_dept = j.sc.next();
			System.out.print("Enter Emp Designation: ");
			j.emp_desg = j.sc.next();
			System.out.print("Enter Emp Salary: ");
			j.emp_salary = j.sc.nextLong();
			
			String sql1 = "INSERT INTO employees VALUES("+j.emp_id+",'"+j.emp_fname+" "+j.emp_sname+"',"+j.emp_age+",'"+j.emp_doj+"','"+j.emp_dept+"','"+j.emp_desg+"',"+j.emp_salary+")";
			stmt = conn.createStatement();
			int rs1 = stmt.executeUpdate(sql1);
			System.out.println(rs1+" records added");
			break;
			
		case 2: // using prepared statement
			String sql2 = "SELECT * from employees WHERE `emp_salary` > ?";
			pstmt = conn.prepareStatement(sql2);
			
			System.out.print("Enter lower limit of salary: ");
			long sal = j.sc.nextLong();
			pstmt.setLong(1, sal);
			
			ResultSet rs2 = pstmt.executeQuery();
			while(rs2.next()) {
				System.out.println(rs2.getInt(1)+"\t"+rs2.getString(2)+"\t"+rs2.getDate(4)+"\t Rs. "+rs2.getLong(7));
			}
			break;
			
		case 3: // using prepared statement
			String sql3 = "UPDATE `employees` SET emp_salary = (emp_salary * 1.2) WHERE `emp_doj` < ?";
			pstmt = conn.prepareStatement(sql3);
			
			System.out.println("Enter DoJ: ");
			String doj = j.sc.next();
			pstmt.setString(1, doj);
			
			int rs3 = pstmt.executeUpdate();
			System.out.println(rs3+" records updated");
			break;
			
		case 4: // using prepared statement
			String sql4 = "DELETE FROM employees WHERE `emp_id` = ?";
			pstmt = conn.prepareStatement(sql4);
			
			System.out.print("Enter ID of person: ");
			int id = j.sc.nextInt();
			pstmt.setInt(1, id);
			
			int rs4 = pstmt.executeUpdate();
			System.out.println(rs4+" records removed");
			break;
			
		case 5:
			conn.close();
			System.out.println("Goodbye!");
			break;
		}
		
	}
	
	int showMenu() {
		int choice;
		do {
			System.out.println("\n\nWhat do you want to do today?");
			System.out.println("1. Add a new record");
			System.out.println("2. Select people with salary higher than a number");
			System.out.println("3. Increment salary by 20% for people whose DoJ is before a date");
			System.out.println("4. Delete a record using Employee ID");
			System.out.println("5. Exit");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();
		} while (choice < 1 || choice > 5);
		
		return choice;
	}
}
