class LensKart {
    int storeId;
    String storeName;
    String location;
    String owner;
    int floors;
    int employees;
    String openingTime;
    String closingTime;
    String category;
    int parking;
    String website;
    int year;
    String status;
    String colorTheme;
    String famousProduct;
    int branches;
    String delivery;
    String repairService;
    String insurance;
    String country;
    Frame frame;

    public LensKart(int storeId, String storeName, String location, String owner, int floors,
                    int employees, String openingTime, String closingTime, String category,
                    int parking, String website, int year, String status, String colorTheme,
                    String famousProduct, int branches, String delivery, String repairService,
                    String insurance, String country, Frame frame) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.owner = owner;
        this.floors = floors;
        this.employees = employees;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.category = category;
        this.parking = parking;
        this.website = website;
        this.year = year;
        this.status = status;
        this.colorTheme = colorTheme;
        this.famousProduct = famousProduct;
        this.branches = branches;
        this.delivery = delivery;
        this.repairService = repairService;
        this.insurance = insurance;
        this.country = country;
        this.frame = frame;
    }

    public void displayDetails() {
        System.out.println("Store Id: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Floors: " + floors);
        System.out.println("Employees: " + employees);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Category: " + category);
        System.out.println("Parking: " + parking);
        System.out.println("Website: " + website);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        System.out.println("Color Theme: " + colorTheme);
        System.out.println("Famous Product: " + famousProduct);
        System.out.println("Branches: " + branches);
        System.out.println("Delivery: " + delivery);
        System.out.println("Repair Service: " + repairService);
        System.out.println("Insurance: " + insurance);
        System.out.println("Country: " + country);
        this.frame.displayDetails();
    }
}