class VVPuram {

    int areaId;
    String areaName;
    String city;
    String state;
    String country;
    int establishedYear;
    int visitorsPerDay;
    String famousFor;
    String location;
    String landmark;
    String category;
    String openingTime;
    String closingTime;
    String cleanliness;
    String security;
    String transport;
    String website;
    String contact;
    String status;
    String description;

    FoodStreet foodStreet;

    public void getAreaDetails(){

        System.out.println("AreaId: " + areaId);
        System.out.println("AreaName: " + areaName);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("VisitorsPerDay: " + visitorsPerDay);
        System.out.println("FamousFor: " + famousFor);
        System.out.println("Location: " + location);
        System.out.println("Landmark: " + landmark);
        System.out.println("Category: " + category);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("Cleanliness: " + cleanliness);
        System.out.println("Security: " + security);
        System.out.println("Transport: " + transport);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);

        this.foodStreet.getFoodStreetDetails();
    }
}