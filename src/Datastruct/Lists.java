package Datastruct;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create a collection
		ArrayList<String> cities = new ArrayList();
		
		//2. Add some elements
		cities.add("Victoria");
		cities.add("Vancouver");
		cities.add("San Jose");
		cities.add("Toronto");
		
		//3. Iterate through the collection
		
		for(String city: cities) {
			System.out.println(city);
		}
		
		//4. Get the size
		int size=cities.size();
		System.out.println("There are so many elements in the collection:"+size);
		
		//5. Retrive specific elements
		System.out.println(cities.get(1));
		
		//6. Remove
		cities.remove(2);
		size=cities.size();
		
		//7. get
		cities.add(0, "first");
		
		for(String city:cities) {
			System.out.println(city);
		}
		

	}

}
