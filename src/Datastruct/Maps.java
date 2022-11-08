package Datastruct;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implement map interface
		
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		util(hMap);

	}
	
	public static void util(Map <Integer,String> map ) {
		map.put(373, "karn");
		map.put(5, "Roger");
		map.put(7,"Ronaldo");
		//acess elements
		System.out.print(map.keySet());
		System.out.print(map);
		
		//3. iterate through map of key-value pairs?
		for(int i: map.keySet()) {
			System.out.print("key:"+i+" value:"+map.get(i));
		}
	}

}
