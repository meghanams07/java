class Twitter{
	User users[] = new User[5];
	int index;
	
	public boolean addUser(User user){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isBioValid = false;
		
		int id = user.getUserId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = user.getUsername();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String bio = user.getBio();
		if(bio != null && !bio.isEmpty()){
			isBioValid = true;
		}
		
		if(isIdValid && isNameValid && isBioValid){
			if(index < users.length){
				this.users[index++] = user;
				isAdded = true;
			}else{
				System.out.println("Twitter Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(User u : users){
			if(u != null){
				System.out.println(u.getUserId()+" "+u.getUsername()+" "+u.getBio());
			}
		}
	}
}