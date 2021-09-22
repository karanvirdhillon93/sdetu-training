package oop;

public class BankAccount implements IRate {
	//Instance variables
	//Define variables uptop
	private String accountNumber;
	//This variable belongs to the particular class and not the object
private	static String routingNumber= "37843";
	private String name;
	private String ssn;
	private String accontType;
	private double balance;
	
	
	//Contructor defintion: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITY called upon instantiation
		//3 Gets called automatically when we create an object
		//4. Same name as class itself
		//5. Constructors have no return type
	
	BankAccount(){
		System.out.println("new account created");
	}
	
	// Overloading: call the same methods name with different arguments
	BankAccount(String accountType){
		System.out.println("new account:"+accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("new account:"+accountType);
		System.out.println("new deposit:"+initDeposit);
		String Msg=null;
		if(initDeposit < 1000) {
			Msg="Err: minimum deposit must be $1000";
		}
	
		else {
			Msg="Thanks for your init deposit of:"+ initDeposit;
		}
	
		
		System.out.println(Msg);
		balance=balance+initDeposit;
	}
	
	
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double withdraw) {
		balance= balance - withdraw;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("Balance is the "+balance);
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[Name: "+name+". "+accountNumber+"Routing Number:"+routingNumber+"Balance $"+"]";
	}
	//can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION:"+activity+"\n$"+balance);
	}
	
	//getters and setters
	
	//allow user to define the name
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//implement methods
	public void setRate() {
		System.out.println("setting rate");
	}
	public void incrementRate() {
		System.out.println("increment rate");
	}
	
	
	
}
