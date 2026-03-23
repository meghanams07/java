class BankAccount{
	private double balance;
	
	BankAccount(){
		System.out.println("bank constructor");
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void credit(double amount){
		if(amount > 0){
			balance = balance + amount;
		}else{
			System.out.println("Please rpovide the valid amount");
		}
    }
  
     public void debit(double amount){
		if(amount >= balance){
			balance = balance - amount;
		}else{
		   System.out.println("Invalid amount");
		 }
    }
	
}