package Datastruct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;



public class CollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		//1.Read a credit card csv statement
		
		//2.Running balance
		double balance=0;
		
		//FILE PATH
		String file="\\C:\\Users\\17785\\Desktop\\creditcard.CSV";
		
		String readrow;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			readrow=br.readLine();
			System.out.println("New Entry:"+"\n--------");
			while(readrow!=null) {
				//do stuff
				//parse the data by commas
				String[] data = readrow.split(",");
				//if credit then subtract
				
				System.out.println("------------");
				String msg=null;
				double amount=0.0;
				
				try {
					amount=Double.parseDouble(data[1]);
				}catch(Exception e) {
					System.out.println("Invalid number to credit:"+data[1]);
				}
				
				if(data[0].equalsIgnoreCase("credit")) {
					msg="credit found $";
					balance-=amount;

				}
				else if(data[0].equalsIgnoreCase("debit")) {
					msg="debit found $";
					balance+=amount;
				}
				
				//print
				System.out.println(msg+amount);
				//read next line
				readrow=br.readLine();
			}
			System.out.println("---------");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//print out values
		System.out.println("Balance is $"+balance);
		checkBalance(balance);
		
		
		

	}
	public static class DebitNumber extends Exception{
		private String num;
		public DebitNumber(String x) {
			this.num=x;
		}
		
		public String toString() {
			return "something went wrong with debit";
		}
	}
	
	public static void checkBalance(double balance) {
		if (balance>0) {
			balance=balance*1.10;
			System.out.println("Outstanding balance + 10% interest $"+balance);
		}
		else if(balance==0) {
			System.out.println("Thank you for your payment");
		}
		else if(balance<0) {
			System.out.println("Thank you for your payment");
			System.out.println("we owe you $"+balance*-1);
		}
	}
	


}
