class Museum {
    int museumId;
    String museumName;
    String location;
    String city;
    String country;
    String founder;
    int establishedYear;
    int galleries;
    int visitorsPerDay;
    String openingTime;
    String closingTime;
    String category;
    String famousArtifact;
    String securityLevel;
    String ticketSystem;
    String website;
    String contact;
    String colorTheme;
    String status;
    String type;

    Diamond diamond;

    public Museum(int museumId, String museumName, String location, String city,
                 String country, String founder, int establishedYear, int galleries,
                 int visitorsPerDay, String openingTime, String closingTime,
                 String category, String famousArtifact, String securityLevel,
                 String ticketSystem, String website, String contact,
                 String colorTheme, String status, String type, Diamond diamond) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.location = location;
        this.city = city;
        this.country = country;
        this.founder = founder;
        this.establishedYear = establishedYear;
        this.galleries = galleries;
        this.visitorsPerDay = visitorsPerDay;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.category = category;
        this.famousArtifact = famousArtifact;
        this.securityLevel = securityLevel;
        this.ticketSystem = ticketSystem;
        this.website = website;
        this.contact = contact;
        this.colorTheme = colorTheme;
        this.status = status;
        this.type = type;
        this.diamond = diamond;
    }

    public void getMuseumDetails() {
        System.out.println("MuseumId: " + museumId);
        System.out.println("MuseumName: " + museumName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Founder: " + founder);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Galleries: " + galleries);
        System.out.println("VisitorsPerDay: " + visitorsPerDay);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("Category: " + category);
        System.out.println("FamousArtifact: " + famousArtifact);
        System.out.println("SecurityLevel: " + securityLevel);
        System.out.println("TicketSystem: " + ticketSystem);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Status: " + status);
        System.out.println("Type: " + type);
        System.out.println("--- Diamond Details ---");
        this.diamond.getDiamondDetails();
        System.out.println("=====================================");
    }
}