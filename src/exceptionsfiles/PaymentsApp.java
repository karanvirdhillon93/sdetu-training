package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		double payment=0;
		boolean positivePayments=true;
		// TODO Auto-generated method stub
		

		//1. Ask the user for input
		
		//2. Get the amount and test the value
		//create a input stream
		Scanner in = new Scanner(System.in);

		//3. Handle exceptions appropriately
		
		do {
			System.out.print("Enter the payment amount:");
			try {
				payment=in.nextDouble();
				if(payment<0) {
					//throw err
					System.out.println("ERR..");
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayments=true;
				}
			}catch(NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again");
				positivePayments=false;
			}
			
		}while(!positivePayments);

		//4. Print Confirmation
		System.out.println("Thank you for your payment"+payment);
	}

}
