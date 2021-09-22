package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanAccount la = new LoanAccount();
		la.incrementRate();
		la.setRate();
		la.setAmortization(0);
		la.setTerm(20);
		
		//creating an account based on rate properties, but it will point to loan account
		IRate account1 = new LoanAccount();
		//only whats available inside of rate
		account1.incrementRate();
	}

}
