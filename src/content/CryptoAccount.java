package content;

public class CryptoAccount implements Irate {
	private static final String walletNumber="123";
	private String accountNumber;
	private String Name;
	private String SSN;
	private String accountType;
	private double balance=0;
	
	CryptoAccount(){
		System.out.println("Crypto Account created");
	}
	
	CryptoAccount(String accountType){
		System.out.println("Crypto Account created with type "+accountType);
	}
	
	CryptoAccount(String account,double deposit){
		System.out.println("Crypto account created with type"+accountType+" Deposit of: "+deposit);
		String msg="";
		if(deposit<=0) {
			msg="err you must deposit more than 0";
		}else {
			msg="Thanks for your depo";
		}
		System.out.println(msg+"your balance is");
		balance+=deposit;
		checkBalance();
		accountType=account;
	}
	
	
	void checkBalance() {
		System.out.println("your balance "+accountType+" "+balance);
	}
	
	public void deposit(int n) {
		balance+=n;
		showActivity("deposit");
	}
	
	private void showActivity(String x) {
		System.out.println("Recent:"+x);
	}
	public void withdraw(int n) {
		String msg="";
		if (balance-n<0) {
			msg="cant withdraw that much";
		}
		else {
			balance-=n;
			msg="withdrawing $";
			System.out.println(msg+n);
		}
		showActivity("withdraw");

	}
	
	@Override
	public String toString() {
		return "["+Name+"]"+" amount:"+balance;
	}
	
	//getters and setters
	public void setName(String n) {
		this.Name="mr."+n;
	}
	
	public String getName() {
		return this.Name;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static String getWalletnumber() {
		return walletNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getSSN() {
		return SSN;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}
	
	
	public void setRate() {
		System.out.println("setting rate");
	}
	
	public void incRate() {
		System.out.println("inc rate");
	}

}
