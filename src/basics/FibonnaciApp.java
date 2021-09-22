package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
	
		int testSequence[]= {4,-3,4,5};
		System.out.println(average(testSequence));

	}

	//Write a function that takes a value n returns the sum of numbers 1 to n
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		
		return n+sum(n-1);
	}
	
	
	/*
	 * Write a function that computes the factorial value
Definition: n! = n*(n-1)! , where 0! = 1
1! = 1
2! = 2 * 1! = 2 * 1
3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
Hint: use the recursive method that was used to calculate Fibonnaci number
	 */
	
	public static int factorial(int n) {
		if(n==0) return 1;
		System.out.println(n);
		return n*(factorial(n-1));
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 * Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
Hint: this should be static functions with a return type of the same data type as the array declaration.
	 */
	
	
	public static int min(int numbers[]) {
		int lowestNumber=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(lowestNumber>numbers[i]) {
				lowestNumber=numbers[i];
			}
		}
		return lowestNumber;
	}
	
	public static int average(int numbers[]) {
		int average=numbers[0];
			for(int i=0;i<numbers.length;i++) {
				if(i==0) {
					average=numbers[i];
				}
				else {
					average=average+numbers[i];
				}	
		
		}
			return average/numbers.length;
	}
	
	
	public static int max(int numbers[]) {
		int max=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(max<numbers[i]) max=numbers[i];
		}
		return max;
	}
	
	
}
