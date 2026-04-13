class TelegramAccount {
    private int id;
    private String name;
    private String username;

    public void setId(int id) { 
	this.id = id; 
	}
    public void setName(String name) { 
	this.name = name; 
	}
    public void setUsername(String username) {
	this.username = username; 
	}

    public int getId() {
	return id;
	}
    public String getName() {
	return name; 
	}
    public String getUsername() {
	return username;
	}
}