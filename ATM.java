class ATM{
	Transaction transactions[] = new Transaction[5];
	int index;
	
	public boolean addTransaction(Transaction transaction){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isTypeValid = false;
		boolean isAmountValid = false;
		
		int id = transaction.getTransactionId();
		if(id > 0){
			isIdValid = true;
		}
		
		String type = transaction.getType();
		if(type != null && !type.isEmpty()){
			isTypeValid = true;
		}
		
		double amt = transaction.getAmount();
		if(amt > 0){
			isAmountValid = true;
		}
		
		if(isIdValid && isTypeValid && isAmountValid){
			if(index < transactions.length){
				this.transactions[index++] = transaction;
				isAdded = true;
			}else{
				System.out.println("ATM Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Transaction t : transactions){
			if(t != null){
				System.out.println(t.getTransactionId()+" "+t.getType()+" "+t.getAmount());
			}
		}
	}
}