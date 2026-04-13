class TwitterAccount {
    private int id;
    private String username;
    private int followers;

    public void setId(int id) { 
	this.id = id;
	}
    public void setUsername(String username) { 
	this.username = username; 
	}
    public void setFollowers(int followers) {
	this.followers = followers;
	}

    public int getId() {
	return id; 
	}
    public String getUsername() {
	return username;
	}
    public int getFollowers() {
	return followers;
	}
}