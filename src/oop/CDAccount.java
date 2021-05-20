package oop;

public class CDAccount extends BankAccount implements IRate {
	
	String interestrate;
	
	void compount() {
		System.out.println("Compounding interest");
	}

}
