class Subscription {
    private int id;
    private String plan;
    private int duration;

    public void setId(int id) { 
	this.id = id;
	}
    public void setPlan(String plan) {
	this.plan = plan;
	}
    public void setDuration(int duration) { this.duration = duration; }

    public int getId() { return id; }
    public String getPlan() { return plan; }
    public int getDuration() { return duration; }
}
