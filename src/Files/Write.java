package Files;

import java.io.File;
import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define file you want to write path
		String fileName="\\C:\\Users\\17785\\Desktop\\file_2_write.txt";
		String msg="I am writing data that will be placed in a file";
		
		//create the file in java
		File file = new File(fileName);
		
		
		try {
			//open the file
			FileWriter fr= new FileWriter(file);
			//write to the file
			fr.write(msg);
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Closing the file writter");
		}

		
		//close the resources
	}

}
