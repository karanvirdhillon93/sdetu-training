package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("setting rate");
		
	}

	@Override
	public void incrementRate() {
		// TODO Auto-generated method stub
		System.out.println("increment rate");
		
	}
	
	public void setTerm(int years) {
		System.out.println("setting years:"+years);
	}
	
	public void setAmortization(int amount) {
		System.out.println("setting ammoritzation"+amount);
	}

}
