class TheoBroma {

    int bakeryId;
    String bakeryName;
    String location;
    String ownerName;
    long contactNumber;
    String email;
    String website;
    int establishedYear;
    int numberOfEmployees;
    boolean isOnlineAvailable;
    String speciality;
    double rating;
    int totalOrders;
    String deliveryPartner;
    boolean hasCustomCakes;
    String openingTime;
    String closingTime;
    String paymentMode;
    int branchCount;
    String theme;

    public TheoBroma() {
        this(1, "TheoBroma", "Bangalore", "Arjun", 9876543210L);
    }

    public TheoBroma(int bakeryId, String bakeryName, String location, String ownerName, long contactNumber) {
        this(bakeryId, bakeryName, location, ownerName, contactNumber,
                "theobroma@gmail.com", "www.theobroma.com", 2010, 25, true,
                "Chocolate Cakes", 4.5, 5000, "Swiggy", true,
                "9 AM", "11 PM", "UPI", 5, "Modern");
    }

    public TheoBroma(int bakeryId, String bakeryName, String location, String ownerName, long contactNumber,
                     String email, String website, int establishedYear, int numberOfEmployees,
                     boolean isOnlineAvailable, String speciality, double rating, int totalOrders,
                     String deliveryPartner, boolean hasCustomCakes, String openingTime,
                     String closingTime, String paymentMode, int branchCount, String theme) {

        this.bakeryId = bakeryId;
        this.bakeryName = bakeryName;
        this.location = location;
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.website = website;
        this.establishedYear = establishedYear;
        this.numberOfEmployees = numberOfEmployees;
        this.isOnlineAvailable = isOnlineAvailable;
        this.speciality = speciality;
        this.rating = rating;
        this.totalOrders = totalOrders;
        this.deliveryPartner = deliveryPartner;
        this.hasCustomCakes = hasCustomCakes;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.paymentMode = paymentMode;
        this.branchCount = branchCount;
        this.theme = theme;
    }

    public void displayDetails() {
        System.out.println(bakeryId);
        System.out.println(bakeryName);
        System.out.println(location);
        System.out.println(ownerName);
        System.out.println(contactNumber);
        System.out.println(email);
        System.out.println(website);
        System.out.println(establishedYear);
        System.out.println(numberOfEmployees);
        System.out.println(isOnlineAvailable);
        System.out.println(speciality);
        System.out.println(rating);
        System.out.println(totalOrders);
        System.out.println(deliveryPartner);
        System.out.println(hasCustomCakes);
        System.out.println(openingTime);
        System.out.println(closingTime);
        System.out.println(paymentMode);
        System.out.println(branchCount);
        System.out.println(theme);
    }
}

