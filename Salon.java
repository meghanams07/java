class Salon {
    int salonId, establishedYear, employees;
    String salonName, owner, location, city, country;
    String category, website, contact, email, openingTime;
    String closingTime, paymentMode, rating, colorTheme;
    String seatingType, status, description;
    Service service;

    public Salon(int salonId, String salonName, String owner, String location,
                String city, String country, int establishedYear, int employees,
                String category, String website, String contact, String email,
                String openingTime, String closingTime, String paymentMode,
                String rating, String colorTheme, String seatingType,
                String status, String description, Service service) {
        this.salonId = salonId;
        this.salonName = salonName;
        this.owner = owner;
        this.location = location;
        this.city = city;
        this.country = country;
        this.establishedYear = establishedYear;
        this.employees = employees;
        this.category = category;
        this.website = website;
        this.contact = contact;
        this.email = email;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.paymentMode = paymentMode;
        this.rating = rating;
        this.colorTheme = colorTheme;
        this.seatingType = seatingType;
        this.status = status;
        this.description = description;
        this.service = service;
    }

    public void displayDetails() {
        System.out.println("\nSalonId: " + salonId);
        System.out.println("SalonName: " + salonName);
        System.out.println("Owner: " + owner);
        System.out.println("Location: " + location + ", " + city);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Employees: " + employees);
        System.out.println("Category: " + category);
        System.out.println("Contact: " + contact + " | " + email);
        System.out.println("Timings: " + openingTime + " - " + closingTime);
        System.out.println("Payment: " + paymentMode);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Seating: " + seatingType);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);
        System.out.println("\nFeatured Service:");
        this.service.displayDetails();
    }
}