class Rocket{

    String name;
    int speed;
    int height;
    int weight;
    String fuelType;
    int stages;
    String country;
    int payload;
    String manufacturer;
    int launchYear;
    int thrust;
    int diameter;
    int crewCapacity;
    int cost;
    String missionType;
    int orbitHeight;
    String launchSite;
    int flightTime;
    String status;
    String engineType;

    Rocket(){
        System.out.println("Rocket Default Constructor");
    }

    Rocket(String name, int speed){
        this.name = name;
        this.speed = speed;
        System.out.println(this.name + " " + this.speed);
    }
}