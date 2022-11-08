package CodingBat;

import java.util.ArrayList;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given a string, return the count of the number of times that a substring length 2 appears in the string
		 * and also as the last 2 chars of the string, 
		 * so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
		 */
		//System.out.println(last2("xaxxaxaxx"));
		
		int[] myArr= {3, 4,5};
		System.out.println(scoresClump(myArr));

	}
	
	public static int last2(String str) {
		String x=str.substring(str.length()-4,str.length());
		System.out.println(x);
		
		return 0;
}
	
	public static boolean noTriples(int[] nums) {
		  boolean result=false;
		  for(int i=0;i<nums.length-2;i++){
		    int check=nums[i];
		    System.out.println("checking number:"+check);
		    System.out.println("number+1:"+nums[i+1]);
		    System.out.println("number+2:"+nums[i+2]);
		    if(nums[i+1]==check && nums[i+2]==check) {
		    	System.out.println("true");
		    	result=true;
		    }
		  }
		  return result;
		}
	
	public static boolean scoresClump(int[] scores) {
		  boolean result=false;
		  //condition like
		  if(scores.length<3) return result;

		  for(int i=0;i<scores.length-2;i++){
		    //first check is to ensure difference
			  System.out.println("number:"+scores[i]);
			  System.out.println(scores[i]+2);
			  System.out.println(scores[i+1]);
		    if(scores[i]+2>=scores[i+1]){
		    	System.out.println("good"+scores[i+1]);
		      if(scores[i]+2>=scores[i+2]){
		    	  System.out.println("good"+scores[i+2]);
		        result=true;
		      }
		        
		    }
		  }
		  return result;
		}

	
}
