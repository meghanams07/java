class CCD {
    int cafeId, establishedYear, outlets;
    String cafeName, founder, headquarters, city, country, website;
    String contact, email, category, specialty, colorTheme, seatingType;
    String wifi, paymentMode, openingTime, closingTime, status;
    Coffee coffee;

    public CCD(int cafeId, String cafeName, String founder, String headquarters,
              int establishedYear, int outlets, String city, String country,
              String website, String contact, String email, String category,
              String specialty, String colorTheme, String seatingType, String wifi,
              String paymentMode, String openingTime, String closingTime, String status,
              Coffee coffee) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.founder = founder;
        this.headquarters = headquarters;
        this.establishedYear = establishedYear;
        this.outlets = outlets;
        this.city = city;
        this.country = country;
        this.website = website;
        this.contact = contact;
        this.email = email;
        this.category = category;
        this.specialty = specialty;
        this.colorTheme = colorTheme;
        this.seatingType = seatingType;
        this.wifi = wifi;
        this.paymentMode = paymentMode;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.status = status;
        this.coffee = coffee;
    }

    public void displayDetails() {
        System.out.println("\nCafeId: " + cafeId);
        System.out.println("CafeName: " + cafeName);
        System.out.println("Founder: " + founder);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Outlets: " + outlets);
        System.out.println("City: " + city + ", " + country);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Category: " + category);
        System.out.println("Specialty: " + specialty);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("SeatingType: " + seatingType);
        System.out.println("Wifi: " + wifi);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("OpeningTime: " + openingTime + " - ClosingTime: " + closingTime);
        System.out.println("Status: " + status);
        System.out.println("\nFeatured Coffee:");
        this.coffee.displayDetails();
    }
}