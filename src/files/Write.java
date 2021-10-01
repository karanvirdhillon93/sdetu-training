package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Define the path that we want to write
		String filename= "C:\\Users\\karnd\\JavaSDET\\JavaTraining\\src\\files\\Files/FileToWrite.txt";
		String message="I am writting data that will be placed to a file";
		
		//2 Create the file in Java
		File file = new File(filename);
		
		
		try {

			//3. Open the file
			FileWriter fw = new FileWriter(file);
			
			//4. Write to the file
			fw.write(message);
			
			//5.Close the resources
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERR.. could not read file"+filename);
			e.printStackTrace();
		} finally{
			System.out.println("Closing the file");
		}
		
		//5. Close the resources
	}

}
