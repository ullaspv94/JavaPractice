import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
 * Program to demonstrate writing and reading an object to file
 * (Assignment 5, Problem 3)
 * --------------------------------------------------------------------------------
 * A program to serialize the student object( no,name,marks). Write a student object
 * into the file and read the same from the file, and publish the result.
 */

public class ObjectToFile extends Student {
	
	static int PASSING_MARKS = 60;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String PWD = "/Users/Ashutosh/Projects/JavaPractice/files/";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students to process? ");
		int count = sc.nextInt();

		ArrayList<Student> al = new ArrayList<>();
		
		Student s[] = new Student[count];		
		for(int i=0; i<count; i++) {
			s[i] = new Student();
			al.add(s[i]);
			System.out.println(s[i].name+" added");
		}
		
		String fname = "studentmarks.dat";
		FileOutputStream fout = new FileOutputStream(PWD+fname);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(al);
		fout.close();
		System.out.println("Object written to file "+fname);
		
		FileInputStream fin = new FileInputStream(PWD+fname);
		ObjectInputStream objin = new ObjectInputStream(fin);
				
		ArrayList<Student> al1 = new ArrayList<>();
		
		al1 = (ArrayList<Student>) objin.readObject();
		
		Iterator itr = al1.iterator();
		
		// Taking 60 as passing marks, iterating over the file and printing result
		
		while(itr.hasNext()) {
			Student s0 = (Student) itr.next();
			if (s0.marks >= PASSING_MARKS)
				System.out.println("Student "+s0.name+" is PASS");
			else
				System.out.println("Student "+s0.name+" is FAIL");
		}
		fin.close();
		sc.close();
	}
	
}
