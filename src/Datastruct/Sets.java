package Datastruct;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset unordered list of unique elements
		
		//LinkedHashSet in the order they were entered
		//HashSet random order
		//TreeSet natural order
		
		
		
		//define collection
		Set <String> animals = new HashSet<String>();
		
		//adding elements
		animals.add("dog");
		animals.add("snake");
		animals.add("cow");
		animals.add("cow");
		
		System.out.print(animals);
		
		//Create a new set that we use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Chicken");
		farmAnimals.add("Turtle");
		farmAnimals.add("dog");
		
		//what is the intersection between animals and farm animals
		//
		//1. copy existing into new set
		Set<String> intersecctionSet=new HashSet<String>(animals);
		
		//2. Retain only the elements that are also in the other set
		intersecctionSet.retainAll(farmAnimals);
		System.out.print(intersecctionSet);
		
		//3. What is the union(in both animals)
		Set <String> unionSet = new HashSet<String>(animals);
		unionSet.addAll(animals);
		
		//4. What is the difference
		Set<String> difference = new HashSet<String>(animals);
		difference.removeAll(farmAnimals);
		System.out.println(difference);
		
		
		
		

	}

}
