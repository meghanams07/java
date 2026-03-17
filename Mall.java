class Mall {
    int mallId;
    String mallName;
    String location;
    int floors;
    int shopsCount;
    String ownerName;
    int parkingCapacity;
    String openingTime;
    String closingTime;
    String securityLevel;
    String foodCourt;
    String cinema;
    int elevators;
    int escalators;
    String color;
    int year;
    String city;
    String country;
    String status;
    String category;
    Shop shop;

    public Mall(int mallId, String mallName, String location, int floors, int shopsCount,
               String ownerName, int parkingCapacity, String openingTime, String closingTime,
               String securityLevel, String foodCourt, String cinema, int elevators,
               int escalators, String color, int year, String city, String country,
               String status, String category, Shop shop) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.location = location;
        this.floors = floors;
        this.shopsCount = shopsCount;
        this.ownerName = ownerName;
        this.parkingCapacity = parkingCapacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.securityLevel = securityLevel;
        this.foodCourt = foodCourt;
        this.cinema = cinema;
        this.elevators = elevators;
        this.escalators = escalators;
        this.color = color;
        this.year = year;
        this.city = city;
        this.country = country;
        this.status = status;
        this.category = category;
        this.shop = shop;
    }

    public void displayDetails() {
        System.out.println("MallId: " + mallId);
        System.out.println("MallName: " + mallName);
        System.out.println("Location: " + location);
        System.out.println("Floors: " + floors);
        System.out.println("ShopsCount: " + shopsCount);
        System.out.println("OwnerName: " + ownerName);
        System.out.println("ParkingCapacity: " + parkingCapacity);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("SecurityLevel: " + securityLevel);
        System.out.println("FoodCourt: " + foodCourt);
        System.out.println("Cinema: " + cinema);
        System.out.println("Elevators: " + elevators);
        System.out.println("Escalators: " + escalators);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Status: " + status);
        System.out.println("Category: " + category);
        System.out.println("\n--- Shop Details ---");
        this.shop.displayDetails();
        System.out.println("------------------------\n");
    }
}