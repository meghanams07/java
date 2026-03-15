class Train{

	int trainId;
	String trainName;
	String source;
	String destination;
	int speed;
	int capacity;
	int numberOfBoggi;
	String type;
	int platform;
	String driverName;
	int year;
	String company;
	int routeNo;
	int engineNo;
	String color;
	int distance;
	String status;
	String category;
	int weight;
	String timing;

	Boggi boggi = new Boggi();

	public void getTrainDetails(){

		System.out.println("TrainId: " + trainId);
		System.out.println("TrainName: " + trainName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Speed: " + speed);
		System.out.println("Capacity: " + capacity);
		System.out.println("NumberOfBoggi: " + numberOfBoggi);
		System.out.println("Type: " + type);
		System.out.println("Platform: " + platform);
		System.out.println("DriverName: " + driverName);
		System.out.println("Year: " + year);
		System.out.println("Company: " + company);
		System.out.println("RouteNo: " + routeNo);
		System.out.println("EngineNo: " + engineNo);
		System.out.println("Color: " + color);
		System.out.println("Distance: " + distance);
		System.out.println("Status: " + status);
		System.out.println("Category: " + category);
		System.out.println("Weight: " + weight);
		System.out.println("Timing: " + timing);

		this.boggi.getBoggiDetails();
	}
}
