package oop;

public class Demo {
	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
				person1.name="Joe";
				person1.phone="778-533-2613";
				person1.emai="joe@example.com";
		//Abstraction
				person1.walk();
		//
				person1.sleep();
		
		Person person2 = new Person();
		person2.name="Sarah";
		person2.sleep();
		/*
		//Person
		
		//Attributes, variables, adjectives (Descriptors)
		String name ="Joe";
		String email ="joe@testemail.com";
		String phone = "778-533-2613";
		
		//Action, activity, behavior
		walking(name);
		System.out.println(name + "is eating");
		
		//What if we wanted to do this for another person?
		String name2 ="Sarah";
		String email2 ="sarah@testemail.com";
		String phone2 = "778-533-2613";
		
		walking(name2);
		System.out.println(name2 + "is eating");
		
		//What about binding data and properties together?
		*/
	}
	
	static void walking (String name) {
		System.out.println(name + "is walking");
	}
	
	
}


class Person{
	
	String name;
	String emai;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}