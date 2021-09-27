package exceptionsfiles;

public class CommonExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int b =0;
		//1. Identify the potential problem area
		//2. Surround with try-catch block
		try {
			int c=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0\n"+e.toString());
		}
		System.out.println("Program is closing");
		
		String[] states = {"CA","TX","FL","NY"};
		String[] Country= new String[3];
		Country[0]= "Canada";
		Country[1]= "USA";
		Country[2]= "Brazil";
		
		for(int i=0;i<=states.length;i++) {
			try{
				System.out.println(states[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR: Index outside of array domain\n");
				System.out.println(e.toString());
				
			} finally {
				//finally will execute regardless if the catch is executed or not
				System.out.println("Configurating through array");
			}
		}
	}

}
