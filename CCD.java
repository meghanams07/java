class CCD {

    int cafeId;
    String cafeName;
    String founder;
    String headquarters;
    int establishedYear;
    int outlets;
    String city;
    String country;
    String website;
    String contact;
    String email;
    String category;
    String specialty;
    String colorTheme;
    String seatingType;
    String wifi;
    String paymentMode;
    String openingTime;
    String closingTime;
    String status;

    Coffee coffee;

    public void getCcdDetails(){

        System.out.println("CafeId: " + cafeId);
        System.out.println("CafeName: " + cafeName);
        System.out.println("Founder: " + founder);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Outlets: " + outlets);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Category: " + category);
        System.out.println("Specialty: " + specialty);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("SeatingType: " + seatingType);
        System.out.println("Wifi: " + wifi);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("Status: " + status);

        this.coffee.getCoffeeDetails();
    }
}