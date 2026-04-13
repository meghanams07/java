class MapReferenceExecutor{
	public static void main(String[] args){
		Location location = new Location();
		
		location.placeName = "Bangalore";
		location.latitude = 12.9716;
		location.longitude = 77.5946;
		location.area = "Majestic";
		location.district = "Bangalore Urban";
		location.state = "Karnataka";
		location.country = "India";
		location.pinCode = 560001;
		
		Map map = new Map();
		map.location = location;
		map.getDetails();
		
	}
}