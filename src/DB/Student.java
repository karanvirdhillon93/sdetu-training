package DB;

public class Student {
	private String name;
	private String SSN;
	private String email;
	static int ID=300;
	private String userID;
	private String[] classes=new String[5];
	private double balance=0;
	private String phone;
	private String city;
	private String state;
	
	public Student(String name, String SSN) {
		this.name =name;
		this.SSN=SSN;
		System.out.println("New Student added to database:"+this.ID+" "+name);
		generateEmail(this.name);
		//gen user id
		generateUserID();
		this.ID+=1;
	}
	
	private void generateEmail(String name) {
		String email=name+"@student.db.com";
		this.email=email;
		System.out.println("Student email created:"+this.email);
		
	}
	
	private void generateUserID() {
		int min=1000;
		int max=9000;
		String num=String.valueOf((int)(Math.random()*(max-min))+min);
		String lastFour=SSN.substring(SSN.length()-4);
		this.userID=String.valueOf(this.ID)+num+""+lastFour;
		System.out.println("Generated ID:"+this.userID);
	}
	
	public void enroll(String x) {
		//array classes and number
		for(int i=0;i<classes.length;i++) {
			if(classes[i]==null) {
				classes[i]=x;
				System.out.println("Student enrolled in "+classes[i]);
				balance+=300;
				break;
			}
		}
		
	}
	
	public void pay(double amount) {
		if(this.balance-amount<0) {
			System.out.println("Too much");
		}
		else {
			this.balance-=amount;
		}
	}
	@Override
	public String toString() {
		return this.name+" "+this.userID+" "+this.SSN;
	}
	
	public void checkBalance() {
		System.out.println("Current balance is:$"+this.balance);
	}
	
	
	//getters+setters
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String x) {
		this.phone=x;
	}

}

/*
New Student constructor that takes name and SSN in the arguments
Automatically create an email ID based on the name
Set a private static ID
Generate a user ID that is a combination of: 
-Static ID
-random 4-digit num between 1000-9000
-Lasr 4 digit of SSN
Methods()
-enroll
-pay
checkBalance
-toString
-showCourse
Use encapulation to set variables (Phone city state)


*/