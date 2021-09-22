package oop;

public class BankAccountApp {
	public static void main (String[] args) {
		/*
		BankAccount acc1= new BankAccount();
		acc1.accountNumber="01683";
		System.out.println(acc1.routingNumber);
		acc1 = new BankAccount("testRun",1000);
		acc1.checkBalance();
		BankAccount acc2 = new BankAccount("Checking Account");
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		*/
		/*
		BankAccount acc1 = new BankAccount("Test account",1200);
		acc1.routingNumber="57";
		BankAccount acc2 = new BankAccount("Second Test account",1300);
		
		System.out.println(acc2.routingNumber+":"+acc1.routingNumber);
		*/
		/*
		BankAccount acc4 = new BankAccount("Tax Free Savings");
		acc4.accountNumber="8374";
		acc4.name="Joe Doe";
		acc4.balance=3000;
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name="Juan";
		cd1.accontType="CD Account";
		cd1.accountNumber= "373";
		cd1.toString();
		System.out.println(cd1.toString());
		cd1.compound();
		acc4.deposit(4000);
		*/
		//With encapsulation : public API methods
		BankAccount acc5 = new BankAccount();
		acc5.setName("Karanvir");
		System.out.println(acc5.getName());
		acc5.setSsn("434");
		acc5.getSsn();
		acc5.setRate();
		acc5.incrementRate();
		
		
		//polymorphism through overloading
		
	}
}
