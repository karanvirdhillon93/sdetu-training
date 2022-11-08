package Datastruct;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet[]= {"a","b","c"};
		
		for (String letter: alphabet) {
			System.out.println(letter);
		}
		
		String users[][]= {{"John","Sarah","Jackson","Admin"},{"IT","HR","QA"}};
		
		//Get the size of the array
		int numOfUsers=users.length;
		int numOfFields=users[0].length;
		System.out.println(" num of users is:"+numOfUsers);
		System.out.println("Num of fields:"+numOfFields);
		
		//Traverse double arr
		for(String[] user:users) {
			System.out.print("");
			for(String name: user) {
				System.out.print(name+" ");
			}
			System.out.println("");
		}
		
		for(int i=0;i<users.length;i++) {
			for(int j=0;j<users[i].length;j++) {
				System.out.println(users[i][j]);
			}
		}
		
	}

}
