
/*
 *  Interface example (Assignment 3, Problem 4)
 *  --------------------------------------------------------------------------------
 *   Defining an interface
 *   Implementing an interface
 *   Using it to create objects and run methods
 */

public class Coordinator {

	public static void main(String[] args) {
		
		cdacInterface p1 = new DAC();
		cdacInterface p2 = new WIMC();
		cdacInterface p3 = new DASS();
		
		System.out.println("DAC");
		p1.placementPercentage();
		System.out.println("WIMC");
		p2.placementPercentage();
		System.out.println("DASS");
		p3.placementPercentage();
	}
}

class DAC extends CDAC implements cdacInterface {

	DAC() {
		courseName = "DAC";
		noStudents = 120;
	}
	
	public void placementPercentage() {
		System.out.println("Enter Students Placed (out of "+noStudents+"): ");
		placedStudents = sc.nextInt();
		System.out.println("Placement Percentage: "+((float) placedStudents / noStudents) * 100+"%");
		
	}
	
}

class WIMC extends CDAC implements cdacInterface {

	WIMC() {
		courseName = "WIMC";
		noStudents = 60;
	}
	
	public void placementPercentage() {
		System.out.println("Enter Students Placed (out of "+noStudents+"): ");
		placedStudents = sc.nextInt();
		System.out.println("Placement Percentage: "+((float) placedStudents / noStudents) * 100+"%");
		
	}
	
}

class DASS extends CDAC implements cdacInterface {

	DASS() {
		courseName = "DASS";
		noStudents = 90;
	}
	
	public void placementPercentage() {
		System.out.println("Enter Students Placed (out of "+noStudents+"): ");
		placedStudents = sc.nextInt();
		System.out.println("Placement Percentage: "+((float) placedStudents / noStudents) * 100+"%");
		
	}
	
}