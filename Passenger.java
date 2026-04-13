class Passenger{
	private int passengerId;
	private String passengerName;
	private String location;
	
	public void setPassengerId(int passengerId){
		this.passengerId = passengerId;
	}
	
	public void setPassengerName(String passengerName){
		this.passengerName = passengerName;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public int getPassengerId(){
		return passengerId;
	}
	
	public String getPassengerName(){
		return passengerName;
	}
	
	public String getLocation(){
		return location;
	}
}