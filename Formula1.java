class Formula1 {
    int teamId;
    String teamName;
    String country;
    String driverName;
    int carNumber;
    int championships;
    int wins;
    int podiums;
    int poles;
    int fastestLaps;
    int points;
    String engineSupplier;
    String teamPrincipal;
    int foundedYear;
    String baseLocation;
    String color;
    int budget;
    int employees;
    String sponsor;
    String status;
    Franchise franchise;

    public Formula1(int teamId, String teamName, String country, String driverName, int carNumber,
                   int championships, int wins, int podiums, int poles, int fastestLaps, 
                   int points, String engineSupplier, String teamPrincipal, int foundedYear,
                   String baseLocation, String color, int budget, int employees, String sponsor,
                   String status, Franchise franchise) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.country = country;
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.championships = championships;
        this.wins = wins;
        this.podiums = podiums;
        this.poles = poles;
        this.fastestLaps = fastestLaps;
        this.points = points;
        this.engineSupplier = engineSupplier;
        this.teamPrincipal = teamPrincipal;
        this.foundedYear = foundedYear;
        this.baseLocation = baseLocation;
        this.color = color;
        this.budget = budget;
        this.employees = employees;
        this.sponsor = sponsor;
        this.status = status;
        this.franchise = franchise;
    }

    public void displayDetails() {
        System.out.println("TeamId: " + teamId);
        System.out.println("TeamName: " + teamName);
        System.out.println("Country: " + country);
        System.out.println("DriverName: " + driverName);
        System.out.println("CarNumber: " + carNumber);
        System.out.println("Championships: " + championships);
        System.out.println("Wins: " + wins);
        System.out.println("Podiums: " + podiums);
        System.out.println("Poles: " + poles);
        System.out.println("FastestLaps: " + fastestLaps);
        System.out.println("Points: " + points);
        System.out.println("EngineSupplier: " + engineSupplier);
        System.out.println("TeamPrincipal: " + teamPrincipal);
        System.out.println("FoundedYear: " + foundedYear);
        System.out.println("BaseLocation: " + baseLocation);
        System.out.println("Color: " + color);
        System.out.println("Budget: " + budget);
        System.out.println("Employees: " + employees);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Status: " + status);
        System.out.println("\n--- Franchise Details ---");
        this.franchise.displayDetails();
        System.out.println("------------------------\n");
    }
}



