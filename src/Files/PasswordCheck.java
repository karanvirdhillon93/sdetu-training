package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read a file the contains multiple sets of passwords
		
		//1.Define path from where we want to read.
		String filename="\\C:\\Users\\17785\\Desktop\\passwords.txt";
		
		//2.Create the file in Java
		File file = new File(filename);
		
		String txt=null;
		
		//3.Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			//4. Read the file
			String line=br.readLine();
			txt=line;
			while(line!=null) {
				line=br.readLine();
				if (line!=null) {
					txt=txt+','+line;
				}
				
			}
			//System.out.println(txt);
			//5. close resources
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String passwords[]=txt.split(",");
		try {
			
			for(int i=0;i<passwords.length;i++) {
				System.out.println("testing password:"+passwords[i]);
				//password
				boolean number=false;
				boolean letter=false;
				boolean specialCase=false;
			
				for (int j=0;j<passwords[i].length();j++) {
					//iterate over each letter
					if(Character.isDigit(passwords[i].charAt(j))){
						//check for num
						number=true;	
					}
					else if (Character.isLetter(passwords[i].charAt(j))) {
						//check for letter
						letter=true;
					}
					else if((passwords[i].charAt(j)=='@')||(passwords[i].charAt(j)=='!')||(passwords[i].charAt(j)=='#')) {
						specialCase=true;
					}
				}
				//depending on missing type throw err;
				if(!number) {
					throw new MissingNumException(passwords[i]);
				}
				else if(!letter) {
					throw new MissingLetException(passwords[i]);
				}
				else if (!specialCase) {
					throw new MissingSpecialException(passwords[i]);
				}
				
			System.out.println("Meets criteria ["+passwords[i]+"]");
				
		}
		}catch(MissingNumException e) {
			e.toString();
		}catch(MissingLetException e) {
			e.toString();
		}catch(MissingSpecialException e) {
			e.toString();
		}
		


	}
	
	public static class MissingNumException extends Exception{
		private String password;
		public MissingNumException(String password) {
			this.password=password;
		}
		@Override
		public String toString() {
			return "missing number in password:"+this.password;
		}
	}
	
	public static class MissingLetException extends Exception{
		private String password;
		
		public MissingLetException(String pass) {
			this.password=pass;
		}
		@Override
		public String toString() {
			return "missing letter:"+this.password;
		}
		
	}
	
	public static class MissingSpecialException extends Exception{
		private String pass;
		public MissingSpecialException(String pass) {
			this.pass=pass;
		}
		@Override
		public String toString() {
			return "missing special case:"+this.pass;
		}
	}

}
