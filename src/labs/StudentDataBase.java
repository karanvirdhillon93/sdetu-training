package labs;

public class StudentDataBase {

	public static void main(String[] args) {
		//Create a Student Database with the following attributes:
		
		/* 1) New Student constructor takes name and SSN in the arguments
		 * 2) Automatically create an email ID based on the name
		 * 3) Set a private static ID
		 * 4) Generate a user ID that is combination of Static ID, random 4-digit number between 1000-9000, and atleast 4 of SSn
		 * 5)Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
		 * 6) use encapulsation to set variables (phone, city, state)
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Student acc1 = new Student("name","4444");
		acc1.setEmail("dhillonapps93@Gmail.com");
		acc1.checkEmail();
		System.out.println("dhillonapps93@gmail.com".length());
		acc1.enroll("ics333");
		System.out.println(acc1.toString());
	}

}
