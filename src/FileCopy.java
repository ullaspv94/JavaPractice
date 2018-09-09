import java.io.*;
import java.util.Scanner;

/*
 * This program demonstrates file copy using java IO (Assignment 5, Problem 2)
 * --------------------------------------------------------------------------------
 * Please update PWD before running the program.
 * 
 */

public class FileCopy {
	
	static String PWD = "/Users/Ashutosh/Projects/JavaPractice/";
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("File Copy Program ");
		System.out.println("Enter Source File: ");
		String source = sc.next();
		System.out.println("Enter Destination File: ");
		String dest = sc.next();
		
		FileInputStream fin = new FileInputStream(PWD+source);
		FileOutputStream fout = new FileOutputStream(PWD+dest);
		
		while (fin.read() != -1) fout.write(fin.read());
		
		System.out.println("File copied to destination!");
		 	
		sc.close();
		fin.close();
		fout.close();

	}

}
