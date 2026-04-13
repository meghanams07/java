class Post{
	private int postId;
	private String caption;
	private String username;
	
	public void setPostId(int postId){
		this.postId = postId;
	}
	
	public void setCaption(String caption){
		this.caption = caption;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public int getPostId(){
		return postId;
	}
	
	public String getCaption(){
		return caption;
	}
	
	public String getUsername(){
		return username;
	}
}