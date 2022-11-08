package refresh;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	private String ssn;
	private String name;
	private String email;
	private static String ID="C";
	private String userID;
	private String phone;
	private String city;
	private String state;
	private ArrayList <String> classList= new ArrayList<String>();	
	double balance=0;
	
	public Student(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
		System.out.println("New student created:"+this.name);
		createEmail();
		createID();
		balance=250.0;
	}
	
	private void createEmail() {
		this.email=this.name+"@school.com";
		System.out.println("Student email is:"+this.email);
		balance+=50.0;
	}
	
	private void createID() {
		//random num 1k-9k;
		Random r = new Random();
		int max=9000;
		int min=1000;
		int randomNum=r.nextInt((max - min) + 1) + min;
		
		//last 4 of ssn
		String lastFour=ssn.substring(0, 4); 
		
		this.userID=this.ID+String.valueOf(randomNum)+lastFour;
		System.out.println("Student id is:"+this.userID);
		balance+=10;
	}
	
	public void enroll(int num, String courseName) {
		String course=String.valueOf(num)+" "+courseName;
		this.classList.add(course);
		//print out course list
		//print out balance
		System.out.println("Student enrolled in:"+course);
		balance+=1000;
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Student balance is:"+balance);
	}
	
	public void pay(double x) {
		this.balance-=x;
		System.out.println("Thank you for your payment of:$"+x);
		if(balance<0) {
			System.out.println("Overpaid by"+balance*-1);
		}
		else if(balance>0) {
			checkBalance();
		}
		else {
			System.out.println("Student balance is:"+balance);
		}
	}
	
	public void showCourses() {
		for(String n: classList) {
			System.out.print("["+n+"]");
		}
		System.out.print("\n");
	}
	
	
	
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
	@Override
	public String toString() {
		return "tostring";
		
	}

}
