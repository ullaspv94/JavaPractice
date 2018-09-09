import java.io.*;
import java.util.Scanner;

/*
 * This program demonstrates file copy using java IO (Assignment 5, Problem 2)
 * --------------------------------------------------------------------------------
 * Please update PWD before running the program.
 * 
 * NOTE: This program is not working as expected needs fixing
 */

// TODO Fix the program

public class FileCopy {
	
	static String PWD = "/Users/Ashutosh/Projects/JavaPractice/files/";
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("File Copy Program ");
		System.out.println("Enter Source File: ");
		String source = sc.next();
		System.out.println("Enter Destination File: ");
		String dest = sc.next();
		
		FileReader fread = new FileReader(PWD+source);
		BufferedReader bread = new BufferedReader(fread);
		FileWriter fwrite = new FileWriter(PWD+dest);
		BufferedWriter bwrite = new BufferedWriter(fwrite);
		
		while (bread.read() != -1) {
			String data = bread.readLine();
			bwrite.write(data);
		}
		
		System.out.println("File copied to destination!");
		 	
		sc.close();
		fread.close();
		fwrite.close();

	}

}
