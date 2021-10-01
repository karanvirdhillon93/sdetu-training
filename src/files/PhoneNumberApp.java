package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		//This will read a text file and will retrieve phone number
		
		//1. define the file path
		//String filename = "C:\\Users\\karnd\\JavaSDET\\JavaTraining\\src\\files\\Files/PhoneNumber.txt";
		String filename ="C:\\Users\\karnd\\JavaSDET\\JavaTraining\\src\\files\\Files/PhoneNumber.txt";
		//2. Create the file in Java
		File file = new File(filename);
		
		String phoneNum=null;
		String[] phoneNums= new String[5];
		System.out.println(phoneNums.length);
			try {
				//3. Open the file
				BufferedReader br = new BufferedReader(new FileReader(file));
				for(int i=0;i<phoneNums.length;i++) {
				
				phoneNums[i] = br.readLine();
				
				
				}
				//4. Close file
				br.close();
			}
				
				
				catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERR.. FILE NOT FOUND");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERR.. Could not read file");
			}
			
			
			int i=0;
		do {
			
		
		//Valid phone number is 10 digits long
		//Valid phone number, there is no 911 in the number sequence
		//Area code cannot start in 0 or 9
		
		try {
			if(phoneNums[i].length()!= 10) {
				throw new TenDigitsException(phoneNums[i]);
			}
			if((phoneNums[i].substring(0,1).equals("0"))||(phoneNums[i].substring(0,1).equals("0"))){
				throw new AreaCodeException(phoneNums[i]);
			}
			
			if(phoneNums[i].contains("911")) {
				throw new EmergencyException(phoneNums[i]);
			}

			System.out.println(phoneNums[i]+"PhoneNum");
		} catch(TenDigitsException e) {
			System.out.println("ERR.. Phone number is not 10 digits");
			System.out.println(e.toString());
		} catch(AreaCodeException e) {
			System.out.println("ERR.. Phone number has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid 911 sequence found"+"\n"+e.toString());
		
		}
		i++;
		} while(i<phoneNums.length);
		
	
		
	}
	
	

}

class TenDigitsException extends Exception{
	String num;
	public TenDigitsException(String num){
		this.num=num;
	}
	
	public String toString() {
		return ("TenDigitsException:"+num);
	}
}

class AreaCodeException extends Exception{
	String num;
	public AreaCodeException(String num) {
		this.num=num;
	}
	public String toString() {
		return ("AreaCodeException:"+num);
	}
}

class EmergencyException extends Exception{
	String num;
	
	public EmergencyException(String num) {
		this.num=num;
	}
	
	public String toString() {
		return("EmergencyException:"+num);
	}
}
