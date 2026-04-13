class SnapchatAccount {
    private int id;
    private String name;
    private String snapId;

    public void setId(int id) { 
	this.id = id; 
	}
    public void setName(String name) {
	this.name = name;
	}
    public void setSnapId(String snapId) {
	this.snapId = snapId;
	}

    public int getId() { 
	return id; 
	}
    public String getName() { 
	return name;
	}
    public String getSnapId() { 
	return snapId; 
	}
}