class Wonderla {
    int parkId;
    String parkName;
    String location;
    String city;
    String state;
    int rides;
    int pools;
    int visitorsPerDay;
    String owner;
    int establishedYear;
    String openingTime;
    String closingTime;
    int ticketPrice;
    String safetyLevel;
    String parkingFacility;
    String foodCourt;
    String website;
    String contact;
    String category;
    String status;

    LazyPool lazyPool;

    public Wonderla(int parkId, String parkName, String location, String city, String state, int rides,
                   int pools, int visitorsPerDay, String owner, int establishedYear, String openingTime,
                   String closingTime, int ticketPrice, String safetyLevel, String parkingFacility,
                   String foodCourt, String website, String contact, String category, String status,
                   LazyPool lazyPool) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.location = location;
        this.city = city;
        this.state = state;
        this.rides = rides;
        this.pools = pools;
        this.visitorsPerDay = visitorsPerDay;
        this.owner = owner;
        this.establishedYear = establishedYear;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
        this.safetyLevel = safetyLevel;
        this.parkingFacility = parkingFacility;
        this.foodCourt = foodCourt;
        this.website = website;
        this.contact = contact;
        this.category = category;
        this.status = status;
        this.lazyPool = lazyPool;
    }

    public void getWonderlaDetails() {
        System.out.println("ParkId: " + parkId);
        System.out.println("ParkName: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Rides: " + rides);
        System.out.println("Pools: " + pools);
        System.out.println("VisitorsPerDay: " + visitorsPerDay);
        System.out.println("Owner: " + owner);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("TicketPrice: " + ticketPrice);
        System.out.println("SafetyLevel: " + safetyLevel);
        System.out.println("ParkingFacility: " + parkingFacility);
        System.out.println("FoodCourt: " + foodCourt);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("--- LazyPool Details ---");
        this.lazyPool.getLazyPoolDetails();
        System.out.println("=====================================");
    }
}
