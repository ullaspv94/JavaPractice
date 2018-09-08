import java.util.Scanner;

/*
 * Abstract Class and Interface definition for Coordinator class
 * (Assignment 3, Problem 4) 
 */

abstract public class CDAC {
	String courseName;
	int noStudents;
	int placedStudents;
	Scanner sc = new Scanner(System.in);
	
}

interface cdacInterface {
	void placementPercentage();
}
