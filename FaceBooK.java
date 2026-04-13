class FaceBooK{
	UserAccount userAccount;
	
	public boolean createAccount(UserAccount userAccount){
		boolean isAccountCreated = false;
		boolean isUserId = false;
		boolean isUserName = false;
		boolean isEmail = false;
		
		int uId = userAccount.getUserId();
		if(uId > 0){
			isUserId = true;
		}
		
	    String uName = userAccount.getUserName();
		if(uName != null && !uName.isEmpty()){
			isUserName = true;
		}
		
		String uEmail = userAccount.getEmail();
		if(uEmail != null && !uEmail.isEmpty()){
			isEmail = true ;
		}
		
		if(isUserId && isUserName && isEmail){
			this.userAccount = userAccount;
			isAccountCreated = true;
		}
	return isAccountCreated;
}

public void getDetails(){
	if(userAccount != null){
		System.out.println("UserId is:"+userId);
		System.out.println("UserName is:"+userName);
		System.out.println("Email is:"+email);
	}else{
		System.out.println("No user Account created");
}
}