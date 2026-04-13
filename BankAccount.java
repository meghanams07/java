class BankAccount{
	private int accountId;
	private String accountHolder;
	private double balance;
	
	public void setAccountId(int accountId){
		this.accountId = accountId;
	}
	
	public void setAccountHolder(String accountHolder){
		this.accountHolder = accountHolder;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public int getAccountId(){
		return accountId;
	}
	
	public String getAccountHolder(){
		return accountHolder;
	}
	
	public double getBalance(){
		return balance;
	}
}