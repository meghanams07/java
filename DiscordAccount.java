class DiscordAccount {
    private int id;
    private String username;
    private String server;

    public void setId(int id) {
	this.id = id;
	}
    public void setUsername(String username) {
	this.username = username; 
	}
    public void setServer(String server) {
	this.server = server; 
	}

    public int getId() { 
	return id; 
	}
    public String getUsername() {
	return username;
	}
    public String getServer() { 
	return server; 
	}
}