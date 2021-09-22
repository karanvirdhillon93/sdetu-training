package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"NY","San-fran","Miami","Dallas"};
		
		
		System.out.println(cities[0]);
		System.out.println(cities[3]);
		
		// Declare & define the array (only size)
		String[] states= new String[5];
		states[0]="California";
		states[1]="Ohio";
		states[2]="NJ";
		states[3]="Texas";
		states[4]="Utah";
		
		System.out.println(states[0]);
		
		//Declare
		String[] countries;
		
		//define the array
		countries=new String[2];
		countries[0]="Usa";
		countries[1]="Canada";
	
		
		
		int i=0;
		//Do loop enters the loop then tests condition.
		do {
			System.out.println(states[i]);
			i=i+1;
		} while (i<5);
		
		
		//while loop , tests condition first then enters loop
		int n;
		n=0;
		boolean stateFound = false;
		while(!stateFound) {
			String state=states[n];
			if(state=="Texas") {
				System.out.println("State Found!");
				stateFound=true;
			}
			System.out.println(stateFound+"SF");
		n++;
		}
		
		// For loop, best structure for iterating through an array
		System.out.println("Printing with for loop");
		for(int x=0;x<5;x++) {
			System.out.println(states[x]);
		}
		
	}

}
