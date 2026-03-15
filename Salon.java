class Salon {

    int salonId;
    String salonName;
    String owner;
    String location;
    String city;
    String country;
    int establishedYear;
    int employees;
    String category;
    String website;
    String contact;
    String email;
    String openingTime;
    String closingTime;
    String paymentMode;
    String rating;
    String colorTheme;
    String seatingType;
    String status;
    String description;

    Service service;

    public void getSalonDetails(){

        System.out.println("SalonId: " + salonId);
        System.out.println("SalonName: " + salonName);
        System.out.println("Owner: " + owner);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Employees: " + employees);
        System.out.println("Category: " + category);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("Rating: " + rating);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("SeatingType: " + seatingType);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);

        this.service.getServiceDetails();
    }
}