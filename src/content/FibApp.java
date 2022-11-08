package content;

public class FibApp {
	public static void main(String[]args) {
		//defined by the sum of the two previous numbers
		//fib(0)==0
		//fib(1)==1
		//fib(2)==fib(1)+fib(0)
		//etc..
		System.out.println(fact(3));
		//
		
	}
	
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return (fib(n-1)+fib(n-2));
	}
	public static int fact(int n) {
		int count=1;
		while(n>0) {
			count=count*(n);
			n--;
		}
		

		
		return count;
	}
}
