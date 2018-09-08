/*
 * Abstract Class example (Assignment 3, Problem 2)
 * --------------------------------------------------------------------------------
 *   (1) Extending an abstract class
 *   (2) Implementing an abstract method
 *   (3) Overriding the abstract method to do something
 */


public class CustomerAccount {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		s1.AccountDetails();
		s1.LoanDetails();
		s1.rateOfInterest();
		
		ICICI i1 = new ICICI();
		i1.AccountDetails();
		i1.LoanDetails();
		i1.rateOfInterest();
		
		HDFC h1 = new HDFC();
		h1.AccountDetails();
		h1.LoanDetails();
		h1.rateOfInterest();
	}
}

abstract class Bank {

	long bAccNo, lAccNo;
	long bAccBal, lAccBal;
	double bAccRate, lAccRate;
	
	void AccountDetails() {
		System.out.println("Bank Account Number: "+bAccNo);
		System.out.println("Bank Account Balance: "+bAccBal);
	}
		
	void LoanDetails() {
		System.out.println("Loan Account Number: "+lAccNo);
		System.out.println("Loan Account Balance: "+lAccBal);
	}
	
	abstract void rateOfInterest();
		
}

class SBI extends Bank {
	
	SBI () {
		bAccNo = 1001;
		bAccBal = 10000;
		bAccRate = 0.055;
		lAccNo = bAccNo + 100000;
		lAccBal = bAccBal + 100000;
		lAccRate = bAccRate + 0.02;
	}
	
	void rateOfInterest() {
		System.out.println("Deposit Rate: "+bAccRate*100.0+"%");
		System.out.println("Lending Rate: "+lAccRate*100.0+"%");
	}
	
}

class ICICI extends Bank {
	
	ICICI () {
		bAccNo = 2001;
		bAccBal = 20000;
		bAccRate = 0.05;
		lAccNo = bAccNo + 200000;
		lAccBal = bAccBal + 200000;
		lAccRate = bAccRate + 0.015;
	}
	
	void rateOfInterest() {
		System.out.println("Deposit Rate: "+bAccRate*100.0+"%");
		System.out.println("Lending Rate: "+lAccRate*100.0+"%");
	}
	
}

class HDFC extends Bank {
	
	HDFC () {
		bAccNo = 3001;
		bAccBal = 30000;
		bAccRate = 0.0525;
		lAccNo = bAccNo + 300000;
		lAccBal = bAccBal + 300000;
		lAccRate = bAccRate + 0.025;
	}
	
	void rateOfInterest() {
		System.out.println("Deposit Rate: "+bAccRate*100.0+"%");
		System.out.println("Lending Rate: "+lAccRate*100.0+"%");
	}
	
}
