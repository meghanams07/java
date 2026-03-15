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

        this.lazyPool.getLazyPoolDetails();
    }
}