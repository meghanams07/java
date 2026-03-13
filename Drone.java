class Drone {

    String brand;
    String model;
    int cameraResolution;
    int flightTime;
    double price;
    int range;
    boolean gps;
    boolean obstacleAvoidance;
    double weight;
    boolean foldable;
    boolean returnHome;
    boolean portable;

    Drone(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Drone(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    Drone(String brand, String model, int cameraResolution){
        this.cameraResolution = cameraResolution;
        System.out.println("Camera Resolution : " + cameraResolution);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime){
        this.flightTime = flightTime;
        System.out.println("Flight Time : " + flightTime);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range){
        this.range = range;
        System.out.println("Range : " + range);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps){
        this.gps = gps;
        System.out.println("GPS : " + gps);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps, boolean obstacleAvoidance){
        this.obstacleAvoidance = obstacleAvoidance;
        System.out.println("Obstacle Avoidance : " + obstacleAvoidance);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps, boolean obstacleAvoidance, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps, boolean obstacleAvoidance, double weight, boolean foldable){
        this.foldable = foldable;
        System.out.println("Foldable : " + foldable);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps, boolean obstacleAvoidance, double weight, boolean foldable, boolean returnHome){
        this.returnHome = returnHome;
        System.out.println("Return Home : " + returnHome);
    }

    Drone(String brand, String model, int cameraResolution, int flightTime, double price, int range, boolean gps, boolean obstacleAvoidance, double weight, boolean foldable, boolean returnHome, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}