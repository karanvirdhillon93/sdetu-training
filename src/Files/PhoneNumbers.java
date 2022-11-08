package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class PhoneNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Define path from where we want to read.
		String filename="\\C:\\Users\\17785\\Desktop\\file.txt";
		
		//2.Create the file in Java
		File file = new File(filename);
		
		//3.Open the file
		BufferedReader br=null;
		try {
			//opening
			br = new BufferedReader(new FileReader(file));
			//read
			String line=br.readLine();
			String txt=line;
			while(line!=null) {
				line=br.readLine();
				if (line!=null){
					txt=txt+'\n'+line;
				}
				
			}
			validate(txt);
			//close
			br.close();


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void validate(String phoneNums) {
		String nums[]=phoneNums.split("\n");
		boolean valid=true;
		String hold=null;
		int i=0;
		do {
			//check strings in num
			String num=nums[i];
			
			
			//count digits
			int count=0;
			for (int j=0;j<num.length();j++) {
				if (Character.isLetter(num.charAt(j))==true) {
					valid=false;					
					hold=num;
				}
				else if(Character.isDigit(num.charAt(j))) {
					count++;
				}
			}
			
			if (num.contains("911")) {
				valid=false;
				hold=num;
			}
			else if (count!=10) {
				valid=false;
				hold=num;
			}
			i++;
			
			if(valid==false) {
				break;
			}
		}while(i<nums.length);
		try {
			if (valid) {
				System.out.println("Valid nums");
			}
			else {
				System.out.println("not valid");
				throw new TendigitException(hold);
			}
		}catch(TendigitException e) {
			e.toString();		}

	}
	
	public static class TendigitException extends Exception{
		String n;
		public TendigitException(String n) {
			System.out.print("ten digit excp");
			this.n=n;
		}
		
		@Override
		public String toString() {
			return "10digit"+this.n;
		}
		
	}

} 
