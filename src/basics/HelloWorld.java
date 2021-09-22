package basics;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("I am adding code to my project");
		
		
		int[] numberSet=new int[5];
		numberSet[0]= 0;
		numberSet[1]=1;
		numberSet[2]=2;
		numberSet[3]=3;
		numberSet[4]=4;

		System.out.println(findAvg(numberSet));
	}
	// iteration test?
	public static int findAvg(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}
	
}
