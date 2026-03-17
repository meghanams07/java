class Train {
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
    Boggi boggi;

    public Train(int trainId, String trainName, String source, String destination, int speed,
                int capacity, int numberOfBoggi, String type, int platform, String driverName,
                int year, String company, int routeNo, int engineNo, String color, int distance,
                String status, String category, int weight, String timing, Boggi boggi) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.speed = speed;
        this.capacity = capacity;
        this.numberOfBoggi = numberOfBoggi;
        this.type = type;
        this.platform = platform;
        this.driverName = driverName;
        this.year = year;
        this.company = company;
        this.routeNo = routeNo;
        this.engineNo = engineNo;
        this.color = color;
        this.distance = distance;
        this.status = status;
        this.category = category;
        this.weight = weight;
        this.timing = timing;
        this.boggi = boggi;
    }

    public void displayDetails() {
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
        System.out.println("\n--- Boggi Details ---");
        this.boggi.displayDetails();
        System.out.println("------------------------\n");
    }
}