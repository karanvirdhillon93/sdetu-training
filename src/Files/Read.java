package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Define path from where we want to read.
		String filename="\\C:\\Users\\17785\\Desktop\\file.txt";
		
		//2.Create the file in Java
		File file = new File(filename);
		
		
		String txt=null;
		try {
			//3.Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			//4. Read the file
			txt=br.readLine();
			//5. close resources
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Err file not found "+filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error could not read the data");
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(txt);
		


	}

}
