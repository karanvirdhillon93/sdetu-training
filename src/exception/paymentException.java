package exception;

public class paymentException extends Exception {
	private double var;
	public paymentException(double x) {
		this.var=x;
	}
	@Override
	public String toString() {
		return "Payment exception string method:"+this.var;
		
	}
}
