package oop;

public class BankAccountanApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
     
		BankAccount acc1 = new BankAccount();
	
		// acc1.name = "Roger Hue";
	    // With Encapsulation
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("1234567");
		System.out.println("SSN: "+acc1.getSsn());
				
		acc1.accountNumber = "01689453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "01689453";
		
		BankAccount acc3 = new BankAccount("Saving account", 5000);
		acc3.accountNumber = "01689453";
		acc3.checkBalance();
		
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestrate = "4.5";
		
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
	}

}
