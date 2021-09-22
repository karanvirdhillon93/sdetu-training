package basics;

public class Days {
	public static void main (String[] args) {
		//Execute different block of code based on condition
		
		String dayOfWeek="e";
		
		switch (dayOfWeek.toUpperCase()) {
		case "Monday": 
			System.out.print("today is Monday");
			break;
		case "TUESDAY": 
			System.out.print("today is Tuesday");
			break;
		case "Wednesday": 
			System.out.print("today is Wednesday");
			break;
		default:
			System.out.print("today is Wednesday");
			break;
		}
	}
}
