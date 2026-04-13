class FaceBookExecutor{
	public static void main(String[] args){
		 UserAccount userAccountOne = new UserAccount(); 
		 userAccount.setUserId(1);
		 userAccount.setUserName("Meg");
		 userAccount.setEmail("meghams6363@gmail.com");
		 
		 FaceBook facebook = new FaceBook();
		 boolean ref = facebook.createAccount(userAccountOne);
		 System.out.println(ref);
		 
		 facebook.getDetails();
	}
}