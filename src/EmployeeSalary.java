
/*
 *  Extending Employee Class and calculating salary based on additional factors
 *  Assignment 2, Problem 5
 *  --------------------------------------------------------------------------------
 *  This extends the Employee class created in Assignment 1, Problem 8 and adds
 *  additional factors like certification and years of experience to calculate
 *  enhanced salary for employees (developers, testers & managers)
 */


public class EmployeeSalary {
	
	public static void main(String[] args) throws InterruptedException {
		
		Developer d = new Developer();
		d.displayData();
		Tester t = new Tester();
		t.displayData();
		Manager m = new Manager();
		m.displayData();
		
	}

}

class Developer extends Employee {
	
	int yearsExp;
	Boolean dacCert;
	Boolean scala;
	
	Developer() throws InterruptedException {
		super();
		System.out.println("Enter Years of Experience: ");
		yearsExp = sc.nextInt();
		System.out.println("Employee has DAC Diploma? (true|false): ");
		dacCert = sc.nextBoolean();
		System.out.println("Employee has Scala Certification? (true|false): ");
		scala = sc.nextBoolean();
		
		if(dacCert == true)
			this.empSal += 1000 * yearsExp;
		if(scala == true)
			this.empSal += 1000 * yearsExp;

	}
	
}

class Tester extends Employee {
	
	int yearsExp;
	Boolean istqbF;
	Boolean istqbA;
	
	Tester() throws InterruptedException {
		super();
		System.out.println("Enter Years of Experience: ");
		yearsExp = sc.nextInt();
		System.out.println("Employee has ISTQB Foundation Certificate? (true|false): ");
		istqbF = sc.nextBoolean();
		System.out.println("Employee has ISTQB Foundation Certificate? (true|false): ");
		istqbA = sc.nextBoolean();
		
		if(istqbF == true)
			this.empSal += 750 * yearsExp;
		if(istqbA == true)
			this.empSal += 750 * yearsExp;
		
	}
	
}

class Manager extends Employee {
	
	int yearsExp;
	Boolean mba;
	Boolean scrumCert;
	
	Manager() throws InterruptedException {
		super();
		System.out.println("Enter Years of Experience: ");
		yearsExp = sc.nextInt();
		System.out.println("Employee has MBA? (true|false): ");
		mba = sc.nextBoolean();
		System.out.println("Employee has SCRUM Master Certificate? (true|false): ");
		scrumCert = sc.nextBoolean();
		
		if(mba == true)
			this.empSal += 1500 * yearsExp;
		if(scrumCert == true)
			this.empSal += 1500 * yearsExp;
		
	}
}
