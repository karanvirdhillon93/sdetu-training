package DB;

public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Tim","12345");
		s1.enroll("science 101");
		s1.checkBalance();
		s1.pay(300);
		System.out.println(s1.toString());
		
		String name="k3d4";
		if (name.length()>=4){
			System.out.println(name.substring(0,4));
		}
		else {
			
		}
		/*
		}
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

	}

}
