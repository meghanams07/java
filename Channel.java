class Channel {
    private int id;
    private String name;
    private int subscribers;

    public void setId(int id) { 
	this.id = id; 
	}
    public void setName(String name) { 
	this.name = name; 
	}
    public void setSubscribers(int subscribers) {
	this.subscribers = subscribers; 
	}

    public int getId() { 
	return id; 
	}
    public String getName() { 
	return name; 
	}
    public int getSubscribers() { 
	return subscribers; 
	}
}
