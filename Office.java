class Office {

    String officeName;
    String companyName;
    String location;
    String city;
    String country;
    int totalEmployees;
    int departments;
    String managerName;
    String officeType;
    String buildingType;
    double areaSize;
    int floors;
    boolean parking;
    boolean cafeteria;
    String workingHours;
    String internetProvider;
    String securitySystem;
    int establishedYear;
    String contactNumber;
    boolean open;

    Office(String officeName, String companyName, String location, String city, String country,
           int totalEmployees, int departments, String managerName, String officeType,
           String buildingType, double areaSize, int floors, boolean parking,
           boolean cafeteria, String workingHours, String internetProvider,
           String securitySystem, int establishedYear, String contactNumber, boolean open) {

        this.officeName = officeName;
        this.companyName = companyName;
        this.location = location;
        this.city = city;
        this.country = country;
        this.totalEmployees = totalEmployees;
        this.departments = departments;
        this.managerName = managerName;
        this.officeType = officeType;
        this.buildingType = buildingType;
        this.areaSize = areaSize;
        this.floors = floors;
        this.parking = parking;
        this.cafeteria = cafeteria;
        this.workingHours = workingHours;
        this.internetProvider = internetProvider;
        this.securitySystem = securitySystem;
        this.establishedYear = establishedYear;
        this.contactNumber = contactNumber;
        this.open = open;
    }

    void display() {

        System.out.println("Office Name: " + this.officeName);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Location: " + this.location);
        System.out.println("City: " + this.city);
        System.out.println("Country: " + this.country);
        System.out.println("Total Employees: " + this.totalEmployees);
        System.out.println("Departments: " + this.departments);
        System.out.println("Manager Name: " + this.managerName);
        System.out.println("Office Type: " + this.officeType);
        System.out.println("Building Type: " + this.buildingType);
        System.out.println("Area Size: " + this.areaSize);
        System.out.println("Floors: " + this.floors);
        System.out.println("Parking: " + this.parking);
        System.out.println("Cafeteria: " + this.cafeteria);
        System.out.println("Working Hours: " + this.workingHours);
        System.out.println("Internet Provider: " + this.internetProvider);
        System.out.println("Security System: " + this.securitySystem);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Open: " + this.open);
        System.out.println("-----------------------------------");
    }
}