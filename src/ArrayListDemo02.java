import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 *  ArrayList implementation from Collections (Assignment 4, Collections Problem 2)
 *  --------------------------------------------------------------------------------
 */

public class ArrayListDemo02 {
	
	public static void main(String[] args) {
		
		ArrayList<Teacher1> Teacher = new ArrayList<>();
		
		Teacher1 t1 = new Teacher1(1343, "Led Zeppelin", "Classic Rock");
		Teacher.add(t1);
		Teacher1 t2 = new Teacher1(1743, "Black Sabbath", "Heavy Metal");
		Teacher.add(t2);
		Teacher1 t3 = new Teacher1(3897, "Pink Floyd", "Psychedelic Rock");
		Teacher.add(t3);
		Teacher1 t4 = new Teacher1(9872, "Iron Maiden", "Heavy Metal");
		Teacher.add(t4);
		Teacher1 t5 = new Teacher1(5134, "Metallica", "Thrash Metal");
		Teacher.add(t5);
		Teacher1 t6 = new Teacher1(9782, "Eminem", "Hip Hop");
		Teacher.add(t6);
		
		ArrayList<Student> Student = new ArrayList<>();
		
		Student s1 = new Student(1005, "Abdul Kalam", "Rocket Science", 34);
		Student.add(s1);
		Student s2 = new Student(1003, "Alfred Newton", "Gravity", 56);
		Student.add(s2);
		Student s3 = new Student(1001, "Galileo", "Cosmology", 67);
		Student.add(s3);
		Student s4 = new Student(1002, "Archimedes", "Geometry", 87);
		Student.add(s4);
		Student s5 = new Student(1004, "Albert Einstein", "Quantum Physics", 79);
		Student.add(s5);
		Student s6 = new Student(1006, "Marie Curie", "Radioactivity", 98);
		Student.add(s6);
			
		System.out.println("--Using for-each Loop--");
		for(Object o: Teacher) {
			if(o.getClass() == Teacher1.class) {
				Teacher1 t = (Teacher1) o;
				t.dispT();
			}
			
			if(o.getClass() == Student.class) {
				Student s = (Student) o;
				s.dispS();
			}
			
		}
		
		for(Object o: Student) {
			if(o.getClass() == Teacher1.class) {
				Teacher1 t = (Teacher1) o;
				t.dispT();
			}
			
			if(o.getClass() == Student.class) {
				Student s = (Student) o;
				s.dispS();
			}
		}
		
		SortByMarks s = new SortByMarks();
		Collections.sort(Student, s);
		for(Student o: Student) {
			o.dispS();
		}
		
	}

}

class Teacher1 {
	
	int id;
	String name;
	String subject;
	
	Teacher1(int id, String name, String subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	
	void dispT() {
		System.out.println("ID: "+id+" ~ Name: "+name+" ~ Subject "+subject);
	}
	
}

class Student implements Serializable {
	
	int rollNo;
	String name;
	String course;
	int marks;
	
	// No need of default constructor here but defining it to use Student class in 
	// other programs
	
	Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		rollNo = sc.nextInt();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Course: ");
		course = sc.next();
		System.out.print("Enter Marks: ");
		marks = sc.nextInt();
	}
	
	Student(int rollNo, String name, String course, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	void dispS() {
		System.out.println("Roll No: "+rollNo+" - Name: "+name+" - Course: "+course+" - Marks: "+marks);
	}
	
}

class SortByMarks implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if(o1.marks > o2.marks)
			return 1;
		else
			return -1;
	}
	
}
