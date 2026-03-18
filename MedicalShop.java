class MedicalShop {

    int shopId;
    String shopName;
    String location;
    String ownerName;
    long contactNumber;
    String licenseNumber;
    int numberOfEmployees;
    boolean isOpen24Hours;
    String openingTime;
    String closingTime;
    double totalRevenue;
    int numberOfMedicines;
    String shopType;
    String pharmacistName;
    int establishedYear;
    boolean hasHomeDelivery;
    String email;
    String website;
    double rating;
    String gstNumber;

    public MedicalShop() {
        this(1, "Apollo Pharmacy", "Bangalore", "Ravi", 9876543210L, "LIC123",
             10, true, "8AM", "11PM", 500000.0, 2000, "Retail", "Suresh",
             2005, true, "apollo@gmail.com", "www.apollo.com", 4.5, "GST123");
    }

    public MedicalShop(int shopId, String shopName, String location, String ownerName,
                       long contactNumber, String licenseNumber, int numberOfEmployees,
                       boolean isOpen24Hours, String openingTime, String closingTime,
                       double totalRevenue, int numberOfMedicines, String shopType,
                       String pharmacistName, int establishedYear, boolean hasHomeDelivery,
                       String email, String website, double rating, String gstNumber) {

        this.shopId = shopId;
        this.shopName = shopName;
        this.location = location;
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
        this.numberOfEmployees = numberOfEmployees;
        this.isOpen24Hours = isOpen24Hours;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.totalRevenue = totalRevenue;
        this.numberOfMedicines = numberOfMedicines;
        this.shopType = shopType;
        this.pharmacistName = pharmacistName;
        this.establishedYear = establishedYear;
        this.hasHomeDelivery = hasHomeDelivery;
        this.email = email;
        this.website = website;
        this.rating = rating;
        this.gstNumber = gstNumber;
    }

    public void displayDetails() {
        System.out.println(shopId + " " + shopName + " " + location + " " + ownerName + " " +
                contactNumber + " " + licenseNumber + " " + numberOfEmployees + " " +
                isOpen24Hours + " " + openingTime + " " + closingTime + " " +
                totalRevenue + " " + numberOfMedicines + " " + shopType + " " +
                pharmacistName + " " + establishedYear + " " + hasHomeDelivery + " " +
                email + " " + website + " " + rating + " " + gstNumber);
    }
}

