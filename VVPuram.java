class VVPuram {
    int areaId, establishedYear, visitorsPerDay;
    String areaName, city, state, country, famousFor, location, landmark;
    String category, openingTime, closingTime, cleanliness, security, transport;
    String website, contact, status, description;
    FoodStreet foodStreet;

    public VVPuram(int areaId, String areaName, String city, String state, String country,
                  int establishedYear, int visitorsPerDay, String famousFor, String location,
                  String landmark, String category, String openingTime, String closingTime,
                  String cleanliness, String security, String transport, String website,
                  String contact, String status, String description, FoodStreet foodStreet) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.establishedYear = establishedYear;
        this.visitorsPerDay = visitorsPerDay;
        this.famousFor = famousFor;
        this.location = location;
        this.landmark = landmark;
        this.category = category;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.cleanliness = cleanliness;
        this.security = security;
        this.transport = transport;
        this.website = website;
        this.contact = contact;
        this.status = status;
        this.description = description;
        this.foodStreet = foodStreet;
    }

    public void displayDetails() {
        System.out.println("\n AreaId: " + areaId);
        System.out.println("AreaName: " + areaName);
        System.out.println("City: " + city + ", " + state);
        System.out.println("Established: " + establishedYear);
        System.out.println("Visitors/Day: " + visitorsPerDay);
        System.out.println("FamousFor: " + famousFor);
        System.out.println("Location: " + location);
        System.out.println("Landmark: " + landmark);
        System.out.println("Category: " + category);
        System.out.println("Open: " + openingTime + " - " + closingTime);
        System.out.println("Cleanliness: " + cleanliness);
        System.out.println("Security: " + security);
        System.out.println("Transport: " + transport);
        System.out.println("Contact: " + contact);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);
        System.out.println("\n🍽️  FEATURED FOOD STREET:");
        this.foodStreet.displayDetails();
    }
}
