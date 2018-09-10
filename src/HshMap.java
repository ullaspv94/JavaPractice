/*
 *Here, searching entries in HashMap is done with a different approach: 
 *entrySet() function in HashMap returns the whole set of Key-Value pairs.
 *And each entry from Set is compared with the user input search term, using .equals().
 *We take user input, create an object of: phno class (if input is Ph No) or person class (if input is First Name and Sur Name).
 *But in our case, we cannot implement the default behavior of .equals() to compare objects in HashMap
 *with the search term that is given as input.
 *
 *(How built-in equals() function works: https://stackoverflow.com/questions/15542656/how-does-equals-method-work-in-java)
 *
 *HashMap, in its own way, generates a Hashcode(a number basically) for every key/value that's inserted.
 *But the User input, though may have same Ph No or Name, will have a different hashcode.
 *Hence the .equals() method doesn't return 'true', resulting in failure to search.
 *
 *So equals() function has been Overridden to implement our own way of comparing, hence making search easier 
*/
import java.util.*;
class person{
	String firstName;
	String surName;
	
	person(String a,String b){
		firstName=a;
		surName=b;
	}
/* 
 * In person class, the .equals() function is overridden, and its functionality is 
 * to compare user input firstName and surName, with each Value, i.e., person object entry in HashMap.
 * 
*/
	@Override
	public boolean equals(Object obj) {				//obj here is the person object 'ptemp' created by user-input firstName and surName
		//System.out.println("In equals function");
		if(!(obj instanceof person)){				//initially checks if ptemp is instance of class person
			return false;
			}
		else{
			person ptemp=(person) obj;
			if((ptemp.firstName.equals(this.firstName))&&(ptemp.surName.equals(this.surName))) { //this is the functionality we need from .equals(), if user-input firstName and surName is equal to the ones in HashMap entry, they're equal!
				return true;
			}
			else {
				return false;
			}
		}
	}
	void disp(){ //display function to display person details
		System.out.println("First Name: "+firstName+" Last Name: "+surName);
	}
}
class phno{
	int areaCode=91;
	long num;
	phno(long b){

		num=b;
	}
/* 
 * In phno class, the .equals() function is overridden, and its functionality is 
 * to compare user input number, with each Key, i.e., phno object entry in HashMap.
 * 
*/
	@Override
	public boolean equals(Object obj) {		//obj here is the person object 'phtemp' created by user-input num
		if(!(obj instanceof phno)){
			return false;}
		else{
			phno phtemp=(phno) obj;
			if(phtemp.num == this.num) {	//this is the functionality we need from .equals(), if user-input num is equal to the one in HashMap entry, they're equal!
				return true;
			}
			else {
				return false;
			}
		}
	}
	void disp(){
		System.out.println("Phone Number: "+areaCode+num);
	}
}
class phonebook{
	static HashMap<Object,Object> hp1=new HashMap<>(); 
	/*
	 * Declaring HashMap static makes it available everywhere and adds to same HashMap any number of times.
	 * Failure to do it will create a new HashMap for every new entry
	 */
	static void main(phno ph1,person p1) { //Key and Values, passed as argument to add
		hp1.put(ph1,p1); //To add a new entry to the HashMap hp1
/*	
 		for(Map.Entry<Object,Object> s:hp1.entrySet()){ //to display whole HashMap
		phno ptemp= ((phno)s.getKey());
		ptemp.disp();
		person btemp;
		btemp=((person)s.getValue());
		btemp.disp();
		}
*/	
	}
	
	//TO SEARCH FOR NAME(VALUES)
	
	static void searchName(phno ph1) { 						//argument is the object generated from user-input number
		int sizeOfHash=hp1.size();
		int entryCount=1;									//entryCount helps us reach till the last entry of the Map, helps in displaying a message if no entry is found 
		for(Map.Entry<Object,Object> s:hp1.entrySet()){ 	//loop to access each entry of HashMap hp1
			phno phtemp= ((phno)s.getKey());
			boolean val = phtemp.equals(ph1); 				//to compare user-input number with current entry Key(i.e., num variable in the current Key object) 
			entryCount++;
			if (val==true) {
				person ptemp=(person)s.getValue();  		//if both num are equal, then getValue returns the firstName and surName and assigns it to ptemp
				ptemp.disp();								//calling display function of ptemp to display names
				break;
			}
			else if((val==false)&&(entryCount>sizeOfHash)){	//if no entries match search term and the entry is the last, then show 'not found' message
				System.out.println("No Name found! You can Add a new entry instead, by continuing the operations");
			}
			else{											//if current entry isn't matching search term and it's not the last entry
				continue;
			}
		}
	}
	
	//TO SEARCH FOR NUMBER(KEYS)
	
	static void searchNumber(person p1) {					//argument is the object generated from user-input firstName and surName
		int sizeOfHash=hp1.size();
		int entryCount=1;									//entryCount helps us reach till the last entry of the Map, helps in displaying a message if no entry is found
		for(Map.Entry<Object,Object> s:hp1.entrySet()){		//loop to access each entry of HashMap hp1
			person ptemp=((person)s.getValue());
			boolean val = ptemp.equals(p1);					//to compare user-input number with current entry Key(i.e., num variable in the current Key object)
			entryCount++;
			if (val==true) {
				phno phtemp= ((phno)s.getKey());			//if both num are equal, then getValue returns the firstName and surName and assigns it to ptemp
				phtemp.disp();								//calling display function of ptemp to display names
				break;
			}
			else if((val==false)&&(entryCount>sizeOfHash)){	//if no entries match search term and the entry is the last, then show 'not found' message
				System.out.println("No number found! You can Add a new entry instead, by continuing the operations");
			}
			else {											//if current entry isn't matching search term and it's not the last entry
				continue;
			}
		}		
	}
	static void displayPhonebook() {						//display function to display all entries
		for(Map.Entry<Object,Object> s:hp1.entrySet()){
			phno ptemp= ((phno)s.getKey());
			ptemp.disp();
			person btemp;
			btemp=((person)s.getValue());
			btemp.disp();
		}
	}
}
public class HshMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num;
		int loop=1;
		while(loop==1){
		System.out.println("1)Add a new PhoneBook Entry");
		System.out.println("2)Find number for a name");
		System.out.println("3)Find name for a number");
		System.out.println("4)Print phonebook Entry");
		System.out.println("9)Quit");
		System.out.println("Enter the choice: ");
		int choice = sc.nextInt();
		switch(choice){
/*
 *For 1st case, we take all the inputs, create object for both Key and Value(phno and person respectively),
 *And call the main function in the phonebook class using phonebook.main(), passing phno object as Key, and person object as Value 
 * 
*/
		case 1: System.out.println("Enter Number: ");
				num=sc.nextLong();
				System.out.println("Enter First Name:");
				String firstName=sc.next();
				System.out.println("Enter Last Name");
				String surName=sc.next();
				person p1=new person(firstName,surName);
				phno ph1=new phno(num);
				phonebook.main(ph1,p1);
				System.out.println("Entry done.");
				System.out.println("Do you want to continue opeations? 1 for Yes, Any other number for No");
				loop=sc.nextInt();
				break;
/*
 *For 2nd case, we take firstName and surName as inputs, create ptemp object using them,
 *And call the searchNumber function in the phonebook class using phonebook.searchNumber(), passing ptemp parameter as Value to search for respective Key
 * 
*/
		case 2: System.out.println("Enter First Name:");
				firstName=sc.next();
				System.out.println("Enter Last Name");
				surName=sc.next();
				person ptemp=new person(firstName, surName);
				phonebook.searchNumber(ptemp);
				System.out.println("Do you want to continue opeations? 1 for Yes, Any other number for No");
				loop=sc.nextInt();
				break;
/*
 *For 2nd case, we take number as input, create phtemp object using them,
 *And call the searchName function in the phonebook class using phonebook.searchName(), passing phtemp parameter as Key to search for respective Value
 * 
*/
		case 3: System.out.println("Enter Number:");
				num=sc.nextLong();
				phno phtemp=new phno(num);
				phonebook.searchName(phtemp);
				System.out.println("Do you want to continue opeations? 1 for Yes, Any other number for No");
				loop=sc.nextInt();
				break;
/*
 *Display all entries by calling displayPhonebook function in the phonebook class using phonebook.displayPhonebook()
*/
		case 4: phonebook.displayPhonebook();
				System.out.println("Do you want to continue opeations? 1 for Yes, Any other number for No");
				loop=sc.nextInt();
				break;
		case 9: System.out.println("Operations Done.");
				System.exit(0);
		}
		System.out.println("Operations Done.");
		}
	}
}
