package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text=null;
		//1. define the file path
		String filename ="C:\\Users\\karnd\\JavaSDET\\JavaTraining\\src\\files\\Files/FileToRead.txt";

		//2. Create the file in Java
		File file = new File(filename);
		
		
		try {
			//3. Open the file
			BufferedReader br;
			br = new BufferedReader(new FileReader(file));
			//4. Read the file
			 text=br.readLine();
			//5. Close the resources
			 br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERR: File not found:"+filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERR: Could not read the data:"+filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
		
		
		//eclipse will que you into what exceptions it thinks
		
		
	}

}
