class SpotifyAccount {
    private int id;
    private String user;
    private String plan;

    public void setId(int id) { 
	this.id = id; 
	}
    public void setUser(String user) { 
	this.user = user; 
	}
    public void setPlan(String plan) { 
	this.plan = plan;
	}

    public int getId() { 
	return id;
	}
    public String getUser() { 
	return user; 
	}
    public String getPlan() { 
	return plan; 
	}
}