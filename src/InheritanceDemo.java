import java.util.Scanner;

/*
 * Program to demonstrate inheritance (Assignment 3, Problem 1)
 * --------------------------------------------------------------------------------
 */

public class InheritanceDemo {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.myProfession();
		PrmEmployee pe = new PrmEmployee();
		pe.myProfession();
		CntEmployee ce = new CntEmployee();
		ce.myProfession();
	}
	
}

class Person {

	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	
	Person() {
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		age = sc.nextInt();	
	}
}

class Employi extends Person {
	
	String profession;
	String empType;
	
	Employi() {
		super();
		profession = "Employee";
	}
	
}

class Teacher extends Person {
	
	String profession;
	
	Teacher() {
		super();
		profession = "Teacher";
	}
	
	void myProfession() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Profession: "+profession);
	}
}

class PrmEmployee extends Employi {
	
	PrmEmployee() {
		super();
		empType = "Permanent";
	}
	
	void myProfession() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Profession: "+profession);
		System.out.println("Emp Type: "+empType);
	}
}

class CntEmployee extends Employi {

	CntEmployee() {
		super();
		empType = "Contract";
	}
	
	void myProfession() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Profession: "+profession);
		System.out.println("Emp Type: "+empType);
	}
}