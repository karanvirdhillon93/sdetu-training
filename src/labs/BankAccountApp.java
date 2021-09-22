package labs;

import java.util.Random;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1= new BankAccount("6748364937",1000.04);
		BankAccount acc2= new BankAccount("8392948493",8484.0);
		BankAccount acc3= new BankAccount("1111133333",353.0);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.accureInterest();
		System.out.println(acc1.toString());
	}

	

}

class BankAccount implements IInterest{
	//Properties of bank account
	private static int iD = 1000;				  // Internal ID
	private String accountNumber; //ID + random 2 digit number + first 2 of ssn
	private static final String routingNumber="888"; // Routing number is going to be unique to all accounts(objects)
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		this.balance=initDeposit;
		this.SSN=SSN;
		System.out.println("New Account Created:"+iD);
		//setting instance variable 'private string SSN' equal to local variable String SSN
		this.SSN=SSN;
		iD++;
		//Making account number, not acessible to the client, but automatically generated
		setAccountNumber();
	}
	
	
	
	//This function will automatically call because we are using it in the constructor
	private void setAccountNumber() {
	
		Random rand = new Random();
		int max=99;
		int min=1;
		int randomNum = rand.nextInt((max - min) + 1) + min;

		accountNumber = iD+""+randomNum+SSN.substring(0,2);
		System.out.println("Your Account Number:"+accountNumber);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill: $"+amount);
		balance=balance-amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Making Deposit: $"+amount);
		balance=balance+amount;
		showBalance();
	}
	
	private void showBalance() {
		System.out.println("Your Balance: $"+balance);
	}
	
	@Override
	public void accureInterest() {
		balance=balance*(1+rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name:"+name+"]\n[Account Number:"+accountNumber+"]\n"+"[Balance: $"+balance+"]";
	}
	
}
