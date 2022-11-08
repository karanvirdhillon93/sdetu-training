package algo;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target) {
		//Iterate through the data set searching for the target
		for(int i=0;i<dataSet.length;i++) {
			if(dataSet[i]==target) {
				return i;
			
			}
			
		}
		return 0;
	}

}
