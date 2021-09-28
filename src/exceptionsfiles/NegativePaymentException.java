package exceptionsfiles;

public class NegativePaymentException extends Exception {
	private double payment;
	
	
	public NegativePaymentException(double payment) {
		System.out.println("ERR: negative payment");
		this.payment=payment;
	}
	
	@Override
	public String toString() {
		return ""+payment;
	}
	
}
