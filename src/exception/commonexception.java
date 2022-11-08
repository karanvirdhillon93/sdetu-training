package exception;

public class commonexception {

	public static void main(String[]args)
	{
		int a=5;
		int b=0;
		String states[]= {"bc","alb","sas"};
		try {
	
			
			int c=a/5;
			
		}catch(Exception e){
			System.out.println("Cannot divide by 0"+e.toString());
			
		}
		try {
			
		
			for(int i=0;i<=states.length;i++) {
				System.out.println(states[i]);
			}
		}catch(Exception e) {
			System.out.println("out of bounds"+e.toString());
		}finally {
			System.out.println("iterating through array");
		}
		
		
		
		
	}
}
