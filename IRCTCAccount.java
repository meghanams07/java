class IRCTCAccount {
    private int id;
    private String name;
    private String train;

    public void setId(int id) {
	this.id = id; 
	}
    public void setName(String name) {
	this.name = name; 
	}
    public void setTrain(String train) {
	this.train = train;
	}

    public int getId() {
	return id; 
	}
    public String getName() {
	return name; 
	}
    public String getTrain() { 
	return train; 
	}
}