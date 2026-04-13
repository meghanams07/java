class Ride {
    private int rideId;
    private String driver;
    private String location;

    public void setRideId(int rideId) { 
	this.rideId = rideId; 
	}
    public void setDriver(String driver) { 
	this.driver = driver; 
	}
    public void setLocation(String location) {
	this.location = location; 
	}

    public int getRideId() { 
	return rideId; 
	}
    public String getDriver() {
	return driver; 
	}
    public String getLocation() { 
	return location;
	}
}
