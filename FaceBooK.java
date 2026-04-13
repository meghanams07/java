class Facebook{
	UserAccount userAccounts[] = new UserAccount[5]; 
	int index;
	
	public boolean createAccount(UserAccount userAccount){
	
		boolean isAccountCreated = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isEmailValid = false;
		
		int uId = userAccount.getUserId();
		if(uId > 0){
			isIdValid = true;
		}
		
		String uName = userAccount.getUserName();
		if(uName!= null && !uName.isEmpty()){  
			isNameValid = true;
		}
		
		String uEmail = userAccount.getEmail();
		if(uEmail!=null && !uEmail.isEmpty()){
			isEmailValid = true;   
		}
		
		if(isIdValid && isNameValid && isEmailValid){
			if(index < userAccounts.length){   
				this.userAccounts[index++] = userAccount;
				isAccountCreated = true;
			}else{
				System.out.println("Storage Full ");
			}
		}
		return isAccountCreated; 
	}
	
	public void getDetails(){
		for(UserAccount s:userAccounts){  
			if(s != null){
				System.out.println(s.getUserId()+" "+s.getUserName()+" "+s.getEmail());
			}
		}
	}
}