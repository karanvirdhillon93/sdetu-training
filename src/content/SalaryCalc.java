package content;

public class SalaryCalc {
	public static void main(String[] args) {
		//Lets create a variable to define our career
		
		//Declare variable
		String career;
		System.out.print("Progress is starting\n");
		career="Software Dev";
		System.out.println("My career is:"+career);
		
		//Declare and define
		int hoursPerWeek=40;
		int weeks=50;
		int rate=100;
		career="Backend Dev";
		double salary=hoursPerWeek*rate*weeks;
		System.out.print("My salary as a:"+career+" at the salary of"+salary);
		
		
		//Compute our anual salary
		//rate*hours*weeks
	}
}
