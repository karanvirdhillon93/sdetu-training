package Datastruct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read and parse data by commas
		
		String file="path";
		
		List<String[]> data = new ArrayList<String[]>();
		String readrow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			readrow=br.readLine();
			while(readrow!=null) {
				//do stuff
				//parse the data by commas
				String[] line = readrow.split(",");
				data.add(line);
				//read next line
				readrow=br.readLine();
			}
		}
			

		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(String[] arr: data) {
			for(String d: arr) {
				System.out.println(d);
			}
		}
		

	}

}
