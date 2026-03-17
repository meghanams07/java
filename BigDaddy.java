class BigDaddy {
    int casinoId;
    String casinoName;
    String location;
    String owner;
    int floors;
    int tables;
    int slotMachines;
    String openingTime;
    String closingTime;
    String securityLevel;
    String famousGame;
    int employees;
    String colorTheme;
    int parking;
    String restaurant;
    String bar;
    String hotel;
    int year;
    String status;
    String category;
    Casino casino;

    public BigDaddy(int casinoId, String casinoName, String location, String owner, int floors,
                    int tables, int slotMachines, String openingTime, String closingTime,
                    String securityLevel, String famousGame, int employees, String colorTheme,
                    int parking, String restaurant, String bar, String hotel, int year,
                    String status, String category, Casino casino) {
        this.casinoId = casinoId;
        this.casinoName = casinoName;
        this.location = location;
        this.owner = owner;
        this.floors = floors;
        this.tables = tables;
        this.slotMachines = slotMachines;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.securityLevel = securityLevel;
        this.famousGame = famousGame;
        this.employees = employees;
        this.colorTheme = colorTheme;
        this.parking = parking;
        this.restaurant = restaurant;
        this.bar = bar;
        this.hotel = hotel;
        this.year = year;
        this.status = status;
        this.category = category;
        this.casino = casino;
    }

    public void displayDetails() {
        System.out.println("CasinoId: " + casinoId);
        System.out.println("CasinoName: " + casinoName);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Floors: " + floors);
        System.out.println("Tables: " + tables);
        System.out.println("SlotMachines: " + slotMachines);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("SecurityLevel: " + securityLevel);
        System.out.println("FamousGame: " + famousGame);
        System.out.println("Employees: " + employees);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Parking: " + parking);
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Bar: " + bar);
        System.out.println("Hotel: " + hotel);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        System.out.println("Category: " + category);
        this.casino.displayDetails();
    }
}