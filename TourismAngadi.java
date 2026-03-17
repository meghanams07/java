class TourismAngadi {

    int agencyId, establishedYear, employees;
    String agencyName, location, city, country, owner, website, contact, email;
    String category, services, license, rating, support, colorTheme, paymentMode, status, branch;
    Package pkg;

    public TourismAngadi(int agencyId, String agencyName, String location, String city, String country,
                        String owner, int establishedYear, int employees, String website, String contact,
                        String email, String category, String services, String license, String rating,
                        String support, String colorTheme, String paymentMode, String status, String branch,
                        Package pkg) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.location = location;
        this.city = city;
        this.country = country;
        this.owner = owner;
        this.establishedYear = establishedYear;
        this.employees = employees;
        this.website = website;
        this.contact = contact;
        this.email = email;
        this.category = category;
        this.services = services;
        this.license = license;
        this.rating = rating;
        this.support = support;
        this.colorTheme = colorTheme;
        this.paymentMode = paymentMode;
        this.status = status;
        this.branch = branch;
        this.pkg = pkg;
    }

    public void displayDetails() {
        System.out.println("AgencyId: " + agencyId);
        System.out.println("AgencyName: " + agencyName);
        System.out.println("Location: " + location + ", " + city);
        System.out.println("Owner: " + owner);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Employees: " + employees);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Rating: " + rating + " ⭐");
        System.out.println("Services: " + services);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("Status: " + status);
        System.out.println("\n Featured Package:");
        this.pkg.displayDetails();
        System.out.println();
    }
}
