package algo;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {8,5,4,3,2,1,7,6};
		Bubble.check(numbers);
		
		//Define a algo that searches for a number
		//int pos=algo.Search.linearSearch(numbers, 4);
		//System.out.println("pos is:"+pos);
		
		//binary search assumes we have a sorted array.
		//int[] sortNumbers= {1,2,3,4,5};
		//binarySearch(sortNumbers,4,0,sortNumbers.length-1);
		//binaryS(sortNumbers,4);

	}
	
	public static int binarySearch(int[] dataSet,int target, int start, int end) {
		//binary search assums a sorted array, then can contunely.
		//split our search in  half
		
		int left=0;
		int right=dataSet.length-1;
		while(left<=right) {
			int mid = left+((right-left)/2);
			if(dataSet[mid]==target) {
				System.out.print("found:"+target+" at"+mid);
				return mid;
			}
			else if(dataSet[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return 0;
	}
	
	
	public static int binaryS(int[]data, int target) {
		
		int left=0;
		int right=data.length-1;
		while(left<=right) {
			int  midPoint=(left+(right-left)/2);
			
			if(data[midPoint]==target) {
				System.out.println("midpoint"+midPoint);
				return midPoint;
			}
			else if (data[midPoint]>target) {
				//
				right=midPoint-1;
			}
			else {
				//midpoint<target
				left=midPoint+1;
			}
		}
		return 0;
	}

}
