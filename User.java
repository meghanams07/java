class User{
	private int userId;
	private String username;
	private String bio;
	
	public void setUserId(int userId){
		this.userId = userId;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setBio(String bio){
		this.bio = bio;
	}
	
	public int getUserId(){
		return userId;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getBio(){
		return bio;
	}
}