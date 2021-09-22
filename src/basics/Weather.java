package basics;

public class Weather {

	public static void main(String[] args) {
		
		//this program will give us suggestion on what to wear based on the weather.
		
		int temperature=65;
		String sunCondition="Sunny";
		
		
		if(temperature >80) {
			System.out.print("wear shorts"+ temperature);
		}
		else if ((temperature>60) && (sunCondition.equalsIgnoreCase("Sunny"))) {
			System.out.println("its cooler"+temperature);
			System.out.print("wear a hat");
		}
		
		else if ((temperature > 50)|| (sunCondition.equalsIgnoreCase("Overcast"))){
			System.out.print("this is a cool day , make sure to wear warmer clothes");
		}
		
		else {
			System.out.println("Cold"+temperature);
		}
		
		System.out.print("progam is ending");
	}
	
}

