package content;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities= {"New york","Sf","Miami","Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		

		
		//Declare array
		String[] country;
		
		//define array
		country=new String[2];
		
		country[0]="USA";
		country[1]="Canada";
		
		
		String[] states= new String[5];
		states[0]="CA";
		states[1]="Ohio";
		states[2]="NJ";
		states[3]="Texas";
		states[4]="utah";

		
		int i=0;
		System.out.println("---------");
		do {
			System.out.println(states[i]);
			i++;
		}while(i<states.length);
		
		int n=0;
		boolean found=false;
		System.out.println("------");
		while(!found) {
			System.out.println(states[n]);
			if (states[n].equalsIgnoreCase("Texas")) {
				System.out.print("found"+n);
				found=true;
			}
			n++;
			
		}
	}

}
