class TourismAngadi {

    int agencyId;
    String agencyName;
    String location;
    String city;
    String country;
    String owner;
    int establishedYear;
    int employees;
    String website;
    String contact;
    String email;
    String category;
    String services;
    String license;
    String rating;
    String support;
    String colorTheme;
    String paymentMode;
    String status;
    String branch;

    Package pkg;

    public void getTourismDetails(){

        System.out.println("AgencyId: " + agencyId);
        System.out.println("AgencyName: " + agencyName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Owner: " + owner);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Employees: " + employees);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Category: " + category);
        System.out.println("Services: " + services);
        System.out.println("License: " + license);
        System.out.println("Rating: " + rating);
        System.out.println("Support: " + support);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("Status: " + status);
        System.out.println("Branch: " + branch);

        this.pkg.getPackageDetails();
    }
}