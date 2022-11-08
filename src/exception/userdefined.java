package exception;

import java.util.Scanner;

public class userdefined {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1= new Payment();
	}
	
	public static class Payment {
		public double payment=0;
		private boolean pospay=true;
		public Payment() {
			do {
				
			
				System.out.print("enter the payment amount");
				Scanner sc = new Scanner(System.in);
				try {
					double payment=sc.nextDouble();
					if (payment<0) {
						this.pospay=false;
						throw new paymentException(payment);
						
					}
					else {
						this.pospay=true;
					}
				}catch(paymentException e){
					System.out.println("err"+e.toString());
					System.out.println("Please try again");
				}
			}while(pospay!=true);
			
			System.out.println("thank you for your payment");

		}
	}
	

		
	}



