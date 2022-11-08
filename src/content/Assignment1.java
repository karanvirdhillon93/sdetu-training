package content;

public class Assignment1 {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n

		//System.out.print(sum(4));
		/*
		 * Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
Hint: this should be static functions with a return type of the same data type as the array declaration.
		 */
		int arr[]= {3,2,3,4,5};
		System.out.println(max(arr));
	}
	
	public static int sum(int n) {
		int count=0;
		for (int i=0;i<=n;i++) {
			count=count+i;
		}
		return count;
	}
	
	public static int min(int values[]) {
		int min=values[0];
		for(int i=1;i<values.length;i++) {
			if (min>values[i]) {
				min=values[i];
			}
		}
		return min;
	}
	
	public static int average(int []values) {
		int sum=0;
		for (int i=0;i<values.length;i++) {
			System.out.println(values[i]);
			sum=sum+values[i];
		}
		return (sum/values.length);
	}
	
	public static int max(int[] values) {
		int max=values[0];
		for(int i=0;i<values.length;i++) {
			if(max<values[i]) {
				max=values[i];
			}
		}
		return max;
	}

}
