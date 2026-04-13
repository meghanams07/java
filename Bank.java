class Bank{
	BankAccount accounts[] = new BankAccount[5];
	int index;
	
	public boolean addAccount(BankAccount account){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isBalanceValid = false;
		
		int id = account.getAccountId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = account.getAccountHolder();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		double bal = account.getBalance();
		if(bal >= 0){
			isBalanceValid = true;
		}
		
		if(isIdValid && isNameValid && isBalanceValid){
			if(index < accounts.length){
				this.accounts[index++] = account;
				isAdded = true;
			}else{
				System.out.println("Bank Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(BankAccount a : accounts){
			if(a != null){
				System.out.println(a.getAccountId()+" "+a.getAccountHolder()+" "+a.getBalance());
			}
		}
	}
}