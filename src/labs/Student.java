package labs;

import java.util.Random;


public class Student implements EmailID {
	//1) New Student constructor takes name and SSN in the arguments
	//2) Automatically create an email ID based on the name.... lets make it a interface
	//Instance variables
	private String name;
	private String SSN;
	private String email;
	private static String ID = "1000";
	//array of classes
	private String classArray[]= new String[4];
	private double studentFees;
	private boolean enrolled=false;
	
	public Student(String name, String SSN) {
		this.name=name;
		this.SSN=SSN;
		this.email=autoEmail(name);
		System.out.println("New Email is:"+this.email+"\n");
	//	ID++;
	//	System.out.print("New student ID is:"+this.ID+"\n");
		//use method to generate new ID
		
		if(SSN.length()<4) {
			System.out.println("SSN must have a length of 4");
		}
	}
	
	
	private String autoEmail(String name) {
		return name+"@gmail.com";
	}


	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
		//create a method to check email qualifications
		//1.email must have '@'
		//2. email must have '.com' can be uppercase
		//3. email must have 3 or more characters before '@'
		System.out.println("Email set:"+this.email);
	}
	
	
	public boolean checkEmail() {
		//checking if email has '@'
		System.out.println("Checking email qulifications\n-------------------");
		//get last 4 characters from string
		if(this.email.length()>=7) {
			String lastFourDigits=email.substring(email.length()-4);
			if(this.email.contains("@")) {
				System.out.println("Email contains: '@'");
				if(lastFourDigits.toUpperCase().contains(".COM")) {
					System.out.println("Email contains: '.com'");
					
					//get characters before last four digits
					String emailName=email.substring(0,email.length()-4);
				}
				return true;
			}
			
		}
		
		return false;
	}
	
	private void generateID() {
	
		//generate random 4 digit number
		Random rand = new Random();
		int max=999;
		int min=1000;
		int randomNumber = rand.nextInt((max-min)+1)+min;
		//get last 4 digits of SSN
		if(SSN.length()>=4) {
			
			String lastFourDigits=SSN.substring(SSN.length()-4);
			this.ID=this.ID+String.valueOf(randomNumber)+lastFourDigits;
			
		}
		
		
	}
	
	public void enroll(String className) {
		
		for(int i=0;i<classArray.length;i++) {
			if(classArray[i]==null) {
				classArray[i]=className;
				System.out.println("Student is now enrolled in:"+className);
				this.studentFees=studentFees+500.00;
				this.enrolled=true;
				break;
			}
		}
	}
	
	public void pay(double cash) {
		this.studentFees=this.studentFees-500.00;
		if(this.studentFees<0) {
			System.out.println("Returning extra $:"+(this.studentFees*-1));
			this.studentFees=0;
		}
		else {
			System.out.println("Paid student fees:"+cash);
		}
	}
	
	public void checkBalance() {
		System.out.println("Outstanding fees are:$"+this.studentFees);
	}
	
	public String toString() {
		return this.name+" Current enrollment status is+"+this.enrolled+" and has fees of: $"+this.studentFees;
	}
}
