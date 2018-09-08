import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestPhoneBook {

	public static void main(String[] args) {
		
		HashMap<Personn, PhoneNumber> PhoneBook = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		// Initializing the Phone Book with 5 entries
		
		Personn p1 = new Personn("Neil", "Armstrong");
		Personn p2 = new Personn("Albert", "Einstein");
		Personn p3 = new Personn("Rene", "Descartes");
		Personn p4 = new Personn("Oliver", "Stone");
		Personn p5 = new Personn("Tom", "Cruise");
		
		PhoneNumber pn1 = new PhoneNumber("011", "23547685");
		PhoneNumber pn2 = new PhoneNumber("022", "34236578");
		PhoneNumber pn3 = new PhoneNumber("033", "87456342");
		PhoneNumber pn4 = new PhoneNumber("044", "44567545");
		PhoneNumber pn5 = new PhoneNumber("055", "42348750");
					
		PhoneBook.put(p1, pn1);
		PhoneBook.put(p2, pn2);
		PhoneBook.put(p3, pn3);
		PhoneBook.put(p4, pn4);
		PhoneBook.put(p5, pn5);
		
		System.out.println("------ PhoneBook Initialised -------");
		System.out.println("-------  PhoneBook Options  --------");
		System.out.println("1. Print the PhoneBook");
		System.out.println("2. Add a new PhoneBook Entry");
		System.out.println("3. Find Phone number for a Name");
		System.out.println("4. Find Name for a Phone number");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
			
		switch(choice) {
		
		case 1:
			pbDisplay(PhoneBook);
			break;
		
		case 2:
			System.out.print("Enter Name followed by Surname: ");
			Personn p6 = new Personn(sc.next(), sc.next());
			System.out.print("Enter AreaCode followed by Number: ");
			PhoneNumber pn6 = new PhoneNumber(sc.next(), sc.next());
			PhoneBook.put(p6, pn6);
			System.out.println("PhoneBook entry added!");
			pbDisplay(PhoneBook);
			break;
			
//		case 3:
//			System.out.print("Search Number for a Name: ");
//			PhoneNumber pns = (PhoneNumber) PhoneBook.get(ps);
//			System.out.println("Number is "+pns.areaCode+"-"+pns.number);
//			break;
//			
//		case 4: 
//			System.out.print("Enter Area Code followed by Number: ");
//			PhoneNumber pn01 = new PhoneNumber (sc.next(), sc.next());
//			Personn p01 = (Personn) PhoneBook.hashCode().getValue(p01);
//			
//			break;
//			
		case 9:
			System.out.println("Bye, bye!");
			break;
		}
	}
	
	static void pbDisplay(HashMap<Personn, PhoneNumber> p) {
		System.out.println("------------ PHONE BOOK ------------");
		for(Map.Entry m: p.entrySet()) {
			Personn p0 = (Personn) m.getKey();
			PhoneNumber pn0 = (PhoneNumber) m.getValue();
			System.out.println(p0.firstName+" "+p0.surName+"\t\t"+pn0.areaCode+"-"+pn0.number);
			
			}
		System.out.println("------------------------------------");
	}
	
}

class Personn {
	
	String firstName, surName;

	Personn(String f, String s) {
		firstName = f;
		surName = s;
	}
}

class PhoneNumber {
	
	String areaCode, number;
	
	PhoneNumber(String ac, String n) {
		areaCode = ac;
		number = n;
	}
}


