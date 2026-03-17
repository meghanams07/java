class Government {

    int governmentId, establishedYear, population, states, ministries;
    String governmentName, country, capital, leader, currency;
    String constitutionType, officialLanguage, parliamentType, website;
    String contact, category, securityLevel, administration, status, description;
    Policy policy;

    public Government(int governmentId, String governmentName, String country, String capital,
                     String leader, int establishedYear, int population, String currency,
                     String constitutionType, String officialLanguage, String parliamentType,
                     int states, int ministries, String website, String contact,
                     String category, String securityLevel, String administration,
                     String status, String description, Policy policy) {
        this.governmentId = governmentId;
        this.governmentName = governmentName;
        this.country = country;
        this.capital = capital;
        this.leader = leader;
        this.establishedYear = establishedYear;
        this.population = population;
        this.currency = currency;
        this.constitutionType = constitutionType;
        this.officialLanguage = officialLanguage;
        this.parliamentType = parliamentType;
        this.states = states;
        this.ministries = ministries;
        this.website = website;
        this.contact = contact;
        this.category = category;
        this.securityLevel = securityLevel;
        this.administration = administration;
        this.status = status;
        this.description = description;
        this.policy = policy;
    }

    public void displayDetails() {
        System.out.println("\nGovernmentId: " + governmentId);
        System.out.println("GovernmentName: " + governmentName);
        System.out.println("Country: " + country);
        System.out.println("Capital: " + capital);
        System.out.println("Leader: " + leader);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Population: " + population);
        System.out.println("Currency: " + currency);
        System.out.println("ConstitutionType: " + constitutionType);
        System.out.println("OfficialLanguage: " + officialLanguage);
        System.out.println("ParliamentType: " + parliamentType);
        System.out.println("States: " + states);
        System.out.println("Ministries: " + ministries);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Category: " + category);
        System.out.println("SecurityLevel: " + securityLevel);
        System.out.println("Administration: " + administration);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);
        System.out.println("\nFeatured Policy:");
        this.policy.displayDetails();
    }
}