package content;

public class Weather {
	public static void main(String[] args) {
		/*This program will give a suggestion of what to wear
		 * based on the temp
		 */
		
		int temp;
		temp=70;
		String sun="Overcast";
		System.out.print(sun.toUpperCase());
		//greater than 80
		if (temp>80){
			System.out.print("its pleasant wear a t-shirt");
		}
		//greater than 60
		else if (temp>60 && sun.equalsIgnoreCase("SUNNY")) {
			System.out.print("Its a little cooler, wear a long sleeve");
			System.out.print("Wear a hate to keep sun out of eyes");
		}
		else if (temp>60 || sun.equalsIgnoreCase("overcast")){
			System.out.print("its a warmer day, wear clothes");
		}
		else {
			System.out.print("Its a cold day bring a sweater");
		}
		
	}
}
