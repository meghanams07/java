class ZoomAccount {
    private int id;
    private String user;
    private String meetingId;

    public void setId(int id) { 
	this.id = id; 
	}
    public void setUser(String user) { 
	this.user = user; 
	}
    public void setMeetingId(String meetingId) { 
	this.meetingId = meetingId; 
	}

    public int getId() {
	return id;
	}
    public String getUser() { 
	return user; 
	}
    public String getMeetingId() {
	return meetingId;
	}
}