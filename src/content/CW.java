package content;

public class CW extends CryptoAccount {
	String interestRate;
	
	void invest() {
		System.out.print("investing at rate"+interestRate);
	}
}
