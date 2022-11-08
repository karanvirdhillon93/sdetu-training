package exception;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=0;
		int c=a/b;
		
		
		
		doMath(12,0);
		answer(a,b);
		
		//program continues
		

	}
	
	public static void doMath(int a,int b) {
		System.out.println(answer(a,b));
	}
	
	public static double answer(int x, int y) {
		return x/y;
	}

}
