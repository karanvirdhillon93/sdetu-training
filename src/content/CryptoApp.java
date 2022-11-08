package content;

public class CryptoApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		CryptoAccount c1=new CryptoAccount();
		
		CryptoAccount c2=new CryptoAccount("ETH");
		
		*/
		CryptoAccount c3=new CryptoAccount("BIT",0.3);
		
		c3.checkBalance();
		c3.setName("time");
		System.out.println(c3.getName());
		c3.deposit(5000);
		c3.withdraw(5);
		System.out.println(c3.toString());
		
		int x=5;
		System.out.print(x.toString());
		
		//poly by changing where its pointing
		//poly by overriding
		//poly by constructors--overloading
		Irate it=new Loan();
		it.setRate();
		it.incRate();
		
		/*
		CW wallet= new CW();
		wallet.Name="Tim";
		wallet.balance=40;
		wallet.interestRate="4";
		wallet.accountNumber="5";
		System.out.println(wallet.toString());
		*/

	}

}
