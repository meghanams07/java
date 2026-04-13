class Map{
	
	Location location;
	
	public boolean addLocation(Location location){
		this.location = location;
		return true;
	}
	
	public void getDetails(){
		System.out.println(this.location.placeName);
		System.out.println(this.location.latitude);
		System.out.println(this.location.longitude);
		System.out.println(this.location.area);
		System.out.println(this.location.district);
		System.out.println(this.location.state);
		System.out.println(this.location.country);
		System.out.println(this.location.pinCode);
	}
}